package Sexto;


import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class BlackJack extends Applet{
    public static final int NUM_CARTAS = 52;
    public static final int CPP = 13; //cartas por palo
    Image imagen;
    Graphics noseve;
    Image imagenes[];
    String nombres[] = {"_of_clubs.png", "_of_diamonds.png", "_of_hearts.png", 
                        "_of_spades.png"}; //palos de las cartas
    Baraja baraja;
    //manos de cartas para los dos jugadores
    Mano jugador;
    Mano crouppier;
    TextField apuesta;
    Button boton1, boton2;
    
    //INIT
    public void init(){
        imagen = this.createImage(1000,700);
        this.resize(1000,700);
        noseve = imagen.getGraphics();
        this.setLayout(new BorderLayout());
        
        //cargar imagenes
        imagenes = new Image[NUM_CARTAS];
        String ruta = "Sexto/Cartas/";
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < CPP; j++) {
                imagenes[(i*CPP) + j] = this.getImage(this.getCodeBase(), ruta + 
                                        (j+1) + nombres[i]);
            }
        }
        baraja = new Baraja(imagenes);
        
        //manos de cartas
        jugador = new Mano(400);
        crouppier = new Mano(100);
        
        Label etiqueta = new Label("Introduce tu apuesta: ",Label.RIGHT);
        apuesta = new TextField("",10);
        Panel panel1 = new Panel();
        panel1.add(etiqueta);
        panel1.add(apuesta);
        this.add("North",panel1);
        
        Panel panel2 = new Panel();
        boton1 = new Button("Carta!");
        boton2 = new Button("Me planto!");
        panel2.add(boton1);
        panel2.add(boton2);
        this.add("South",panel2);
        
    }
    
    public void update(Graphics g){ 
        paint(g); //para no borrar
    }
    
    //PAINT
    public void paint(Graphics g){
        noseve.setColor(Color.green);
        noseve.fillRect(0, 0, 1000, 700);
        
        //jugador.agregar(baraja.darCarta());
        
        //mano de cartas
        jugador.paint(noseve, this);
        crouppier.paint(noseve, this);
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public boolean action(Event ev, Object obj){
        if(ev.target instanceof TextField){
            apuesta.setEditable(false);
            
            jugador.agregar(baraja.darCarta());
            jugador.agregar(baraja.darCarta());
            crouppier.agregar(baraja.darCarta());
            
            repaint();
            return true;
        } else if (ev.target instanceof Button) {
            if (ev.arg.equals("Carta!")) {
                jugador.agregar(baraja.darCarta());
                if (jugador.seHaPasado()) {
                    juegaElCrouppier();
                }
            } else if (ev.arg.equals("Me planto!") ) {
                juegaElCrouppier();
            }
            repaint();
            return true;
        }
        return false;
    }
    public void juegaElCrouppier() {
        while (crouppier.menor17()) {
            crouppier.agregar(baraja.darCarta());
        }
        repaint();
    }
}