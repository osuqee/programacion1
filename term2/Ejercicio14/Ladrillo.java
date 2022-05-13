
package Ejercicio14;

import java.awt.*;

public class Ladrillo extends Bloque{
    public Ladrillo (int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }
    
    public void dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillRect(this.x, this.y, this.width, this.height);
    }
}
