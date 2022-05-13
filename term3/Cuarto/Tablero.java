
package Cuarto;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URL;


public class Tablero extends Applet {
    public static final int TIEMPO = 100;
    public static final int TAM = 5;
    
    Image imagen;
    Graphics noseve;
    Image imagenes[][];
    Lugar lugares[][];
    AudioClip error;
    AudioClip acierto;
    AudioClip exito;
    Point blanco;
    Button boton;
    
    public void init () {
        this.resize(250,300);
        imagen = this.createImage(250,300);
        noseve = imagen.getGraphics();
        
        imagenes = new Image[TAM][TAM];
        for (int i=0; i<TAM; i++) {
            for (int j=0; j<TAM; j++) {
                imagenes[i][j] = this.getImage(this.getCodeBase(),"Cuarto/botones/"+(i*TAM+j+1)+".gif");
            }
        }
        
        lugares = new Lugar[TAM][TAM];
        for (int m=0; m<TAM; m++) {
            for (int n=0; n<TAM; n++) {
                lugares[m][n] = new Lugar(imagenes[m][n],(m*TAM+n+1));
            }
        }
        
        //error = getAudioClip(this.getCodeBase(),"Cuarto/botones/error.wav");
        try {
            error = getAudioClip(new URL(this.getCodeBase(),"Cuarto/sonidos/error.wav"));
            acierto = getAudioClip(new URL(this.getCodeBase(),"Cuarto/sonidos/nice.wav"));
            exito = getAudioClip(new URL(this.getCodeBase(),"Cuarto/sonidos/exito.wav"));
        } catch(MalformedURLException ex){}
        blanco = new Point(TAM-1,TAM-1);
        boton = new Button("Iniciar");
        this.setLayout(new BorderLayout());
        this.add("South",boton);
    }
    
    
    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint (Graphics g) {
        noseve.setColor(Color.pink);
        noseve.fillRect(0,0,250,300);
        
        for (int k=0; k<TAM; k++) {
            for (int l=0; l<TAM; l++) {
                lugares[k][l].paint(noseve, this, k, l);
                //noseve.drawImage(imagenes[l][k], k*50, l*50, this);
            }
        }
        
        g.drawImage(imagen,0,0,this);
    }
    
    public int delta(int a, int b) {
        if (a == b) return 0;
        else return ((b-a)/Math.abs(b-a));
    }
    
    public boolean mover(Point click) {
        Point desplazamiento, hasta;
        desplazamiento = new Point(delta(click.x, blanco.x),delta(click.y,blanco.y));
        if ((desplazamiento.x == 0) && (desplazamiento.y == 0)) {
            return false;
        } 
        if ((desplazamiento.x != 0) && (desplazamiento.y != 0)) {
            return false;
        } 
        
        hasta = new Point(click.x + desplazamiento.x, click.y + desplazamiento.y);
        if (!((hasta.x == blanco.x) && (hasta.y == blanco.y)))
            mover(hasta);
        lugares[blanco.x][blanco.y].setImagen(lugares[click.x][click.y].getImagen());
        lugares[blanco.x][blanco.y].valor = lugares[click.x][click.y].valor;
        lugares[click.x][click.y].setImagen(null);
        lugares[click.x][click.y].valor = 25;
        blanco = click;
        repaint();
        return true;
    }
    
    public boolean comprobar() {
        boolean fin = true;
        for (int i=0; i<TAM; i++) {
            for (int j=0; j<TAM; j++) {
                if (lugares[i][j].valor != i*TAM + j+1) {
                   fin = false; 
                   break;
                }
            }
        }
        return fin;
    }
    
    public boolean mouseDown(Event ev, int x, int y) {
        Point click;
        click = new Point(y/Lugar.DIM, x/Lugar.DIM);
        if (!mover(click)) {
            error.play();
        } else {
            acierto.play();
            if (comprobar()) {
                exito.play();
            }
        }
        return true;
    }
    public boolean action (Event ev, Object ob) {
        if (ev.target instanceof Button) {
            for (int i=0; i<100; i++) {
                mover(new Point((int)(Math.random()*5),(int)(Math.random()*5)));
            }
            return true;
        }
        return false;
    }
}

