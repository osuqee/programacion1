
package Ejercicio16;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

public class Bala extends Rectangle{
    public static final int VELY = 9;
    
    public Bala(int x) {
        super(x,435,5,7);
    }
    public void dibujar(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(this.x, this.y, this.width, this.height);
    }
    public void actualizar() {
        this.y -= VELY;
    }
}
