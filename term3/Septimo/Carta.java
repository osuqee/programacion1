
package Septimo;

import java.applet.Applet;
import java.awt.*;

public class Carta extends Rectangle {
    public static final int WIDTH = 70;
    public static final int HEIGHT = 120;
    public static final int PICAS = 0;
    public static final int DIAMANTES = 1;
    public static final int CORAZONES = 2;
    public static final int TREBOLES = 3;
    public static final int ROJO = 1;
    public static final int NEGRO = 2;
    private Image imagen;
    private int valor;
    private int color;
    private int palo;
    
    public Carta(Image img,int v, int c, int p){
        super(-200,-200,WIDTH,HEIGHT);
        imagen = img;
        valor = v;
        color = c;
        palo = p;
    }
    
    public void paint(Graphics g, Applet a){
        g.drawImage(imagen, x, y, width, height, a);
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getPalo() {
        return palo;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }
    
}