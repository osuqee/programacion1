
package Segundo;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Pieza extends Rectangle {
    public static final int DIMENSION = 60;
    
    Image imagen;
    int posicion;
    private boolean colocado = false;

    public boolean isColocado() {
        return colocado;
    }

    public void setColocado(boolean colocado) {
        this.colocado = colocado;
    }
    
    public Pieza(Image img, int pos) {
        super((int)(Math.random()*250)+400,(int)(Math.random()*440),DIMENSION, DIMENSION);
        imagen = img;
        posicion = pos;
    }
    
    public void paint(Graphics g, Applet a) {
        g.drawImage(imagen, x, y, width, height, a);
    }
    
    public void mover(int posX, int posY) {
        if (!isColocado()) {
            this.x = posX-30;
            this.y = posY-30;
        }
    }
    
    public void ajustar(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
