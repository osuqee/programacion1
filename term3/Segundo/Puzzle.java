
package Segundo;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;


public class Puzzle extends Applet{
    public static final int TIEMPO = 100;
    public static final int NUM_PIEZAS = 25;
    public static final int NUM_FILAS = 5;
    
    Image imagen;
    Graphics noseve;
    Image imagenes[];
    Pieza piezas[];
    Pieza actual;
    Rectangle lugares[][];
    
    public void init () {
        this.resize(700,500);
        imagen = this.createImage(700,500);
        noseve = imagen.getGraphics();
        imagenes = new Image [NUM_PIEZAS];
        piezas = new Pieza [NUM_PIEZAS];
        lugares = new Rectangle [NUM_FILAS][NUM_FILAS];
        for (int i=0; i<NUM_PIEZAS; i++) {
            imagenes[i] = this.getImage(this.getCodeBase(),"Segundo/directorioImagenes/" + (i+1) + ".png");
            piezas[i] = new Pieza(imagenes[i],i);
        }
        for (int k=0; k<NUM_FILAS; k++) {
            for (int l=0; l<NUM_FILAS; l++) {
                lugares[k][l] = new Rectangle(Pieza.DIMENSION*l,Pieza.DIMENSION*k,60,60);
            }
        }
    }
    
    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint (Graphics g) {
        noseve.setColor(Color.pink);
        noseve.fillRect(0,0,700,500);
        
        noseve.setColor(Color.red);
        for (int c=0; c<NUM_FILAS; c++) {
            for (int s=0; s<NUM_FILAS; s++) {
                noseve.drawRect(lugares[c][s].x,lugares[c][s].y,lugares[c][s].width,lugares[c][s].height);
            }
        }
        
        for (int j=0; j<NUM_PIEZAS; j++) {
            piezas[j].paint(noseve,this);
        }
        
        g.drawImage(imagen,0,0,this);
    }
    
    public boolean mouseDown(Event ev, int x, int y) {
        for (int i=0; i<NUM_PIEZAS; i++) {
            if (piezas[i].contains(x,y)) {
                actual = piezas[i];
            }
        }
        return true;
    }
    public boolean mouseDrag(Event ev, int x, int y) {
        if (actual != null) {
            actual.mover(x, y);
            repaint();
        }
        return true;
    }
    public boolean mouseUp(Event ev, int x, int y) {
        if (actual != null) for (int i = 0; i<NUM_FILAS; i++) {
            for (int j=0; j<NUM_FILAS; j++) {
                    if (lugares[i][j].intersects(actual)) {
                        if (actual.posicion == NUM_FILAS*i + j) {
                            actual.setColocado(true);
                            actual.ajustar(lugares[i][j].x,lugares[i][j].y);
                        }
                    }
                }
        }
        repaint();
        actual = null;
        return true;
    }
}

