
package Quinto;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Ficha extends Rectangle {
    public static final int DIM = 50;
    Image imagen;
    int valor; 
    ArrayList<Integer> numerosApostados;
    
    public Ficha(Image imagen, int y, int valor) {
        super(600,y,DIM,DIM);
        this.imagen = imagen;
        this.valor = valor;
        numerosApostados = new ArrayList<Integer>();
    }
    
    public void paint(Graphics g, Applet a) {
        g.drawImage(imagen,x,y,DIM,DIM,a);
    }
    
    public void mover(int x, int y) {
        this.x = x-25;
        this.y = y-25;
    }
    
    public void cargarApostados(Casilla[][] casillas) {
        numerosApostados.clear();
        for (int i=0; i<Ruleta.FILAS; i++) {
            for (int j=0; j<Ruleta.COLUMNAS; j++) {
                if (this.intersects(casillas[i][j])) {
                    this.numerosApostados.add(casillas[i][j].getValor());
                }
            }
        }
    }
}
