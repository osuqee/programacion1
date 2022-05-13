package Septimo;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;


public class Solitario extends Applet{
    public static final int NUM_CARTAS = 52;
    public static final int CPP = 13; //cartas por palo
    public static final int NUM_PALOS = 4;
    public static final int NUM_MAZOS_JUEGO = 7;
    Image imagen;
    Graphics noseve;
    Image imagenes[];
    String nombres[] = {"_of_clubs.png", "_of_diamonds.png", "_of_hearts.png", 
                        "_of_spades.png"}; //palos de las cartas
    Image imgReverso;
    Rectangle reverso;
    Baraja baraja;
    MazoSecundario mSecundario;
    Carta activa;
    MazoPalo mazosP[];
    MazoJuego mazosJ[];
    int activaX, activaY;
    
    
    public void init(){
        imagen = this.createImage(1000,700);
        this.resize(1000,700);
        noseve = imagen.getGraphics();
        this.setLayout(new BorderLayout());
        
        imagenes = new Image[NUM_CARTAS];
        String ruta = "Sexto/Cartas/";
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < CPP; j++) {
                imagenes[(i*CPP) + j] = this.getImage(this.getCodeBase(), ruta + 
                                        (j+1) + nombres[i]);
            }
        }
        imgReverso = getImage(this.getCodeBase(),"Septimo/Cartas/reverso.png");
        reverso = new Rectangle(20,20,Carta.WIDTH,Carta.HEIGHT);
        
        baraja = new Baraja(imagenes);
        mSecundario = new MazoSecundario();
        
        mazosP = new MazoPalo [NUM_PALOS];
        for (int i=0; i<NUM_PALOS; i++) {
            mazosP[i] = new MazoPalo(400+i*100);
        }
        
        mazosJ = new MazoJuego [NUM_MAZOS_JUEGO];
        for (int g=0; g<NUM_MAZOS_JUEGO; g++) {
            mazosJ[g] = new MazoJuego(200 + g*100);
        }
    }
    
    public void update(Graphics g){ 
        paint(g); //para no borrar
    }
    
    //PAINT
    public void paint(Graphics g){
        noseve.setColor(Color.green);
        noseve.fillRect(0, 0, 1000, 700);
        
        noseve.drawImage(imgReverso,20,20,Carta.WIDTH,Carta.HEIGHT,this);
        
        mSecundario.paint(noseve, this);
        
        for (int i=0; i<NUM_PALOS; i++) {
            mazosP[i].paint(noseve, this);
        }
        
        for (int i=0; i<NUM_MAZOS_JUEGO; i++) {
            mazosJ[i].paint(noseve,this);
        }
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public boolean mouseDown(Event e, int x, int y) {
        activaX = x;
        activaY = y;
        if (reverso.contains(x,y)) {
            mSecundario.addCard(baraja.darCarta());
            repaint();
        }
        if (mSecundario.lastCard().contains(x,y)) {
            activa = mSecundario.lastCard();
        }
        for (int i=0; i<NUM_MAZOS_JUEGO; i++) {
            if (mazosJ[i].lastCard().contains(x,y)) {
                activa = mazosJ[i].lastCard();
            }
        }
        return true;
    }
    public boolean mouseDrag(Event e, int x, int y) {
        if (activa != null) {
            activa.x = x - Carta.WIDTH/2;
            activa.y = y - Carta.HEIGHT/2;
            repaint();
        }
        return true;
    }
    public boolean mouseUp(Event e, int x, int y) {
        boolean encontrado = false;
        if (activa != null) {
            for (int i=0; i<NUM_PALOS; i++) {
                if (activa.intersects(mazosP[i])) {
                    if (mazosP[i].addCard(activa)) {
                        encontrado = true;
                        mSecundario.deleteCard();
                        break;
                    }
                    
                }
            }
            for (int i=0; i<NUM_MAZOS_JUEGO; i++) {
                if (activa.intersects(mazosJ[i])) {
                    if (mazosJ[i].addCard(activa)) {
                        encontrado = true;
                        mSecundario.deleteCard();
                        mazosJ[i].recolocar(activa);
                        break;
                    }
                } else if (mazosJ[i].cartas.get(mazosJ[i].cartas.size()-1).intersects(activa)) {
                    if (mazosJ[i].addCard(activa)) {
                        encontrado = true;
                        mSecundario.deleteCard();
                        mazosJ[i].recolocar(activa);
                        break;
                    }
                }
            }
            if (!encontrado) {
                activa.x = activaX;
                activa.y = activaY;
            }
            activa = null;
            repaint();
        }
        return true;
    }
    public boolean action(Event ev, Object obj){
        return false;
    }
}