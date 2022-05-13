
package Ejercicio15;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Pajaro extends Rectangle {
    Color color;
    public static final int GRAVITY = 4;
    
    public Pajaro() {
        super(100,23,15,15);
        color = Color.orange;
    }
    
    public void actualizar() {
        this.y += GRAVITY;
    }
    
    public void dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillRect(this.x, this.y, this.width, this.height);
    }
}
