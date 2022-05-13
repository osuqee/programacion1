
package Ejercicio16;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics;

public class Gun extends Rectangle{
    public static final int VELX = 15;
    
    public Gun() {
        super(130,450,15,20);
    }
    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(this.x, this.y, this.width, this.height);
    }
    public void actualizar(boolean derecha) {
        if (derecha) 
            if (this.x > 280)
                x = 280;
            else
                x += VELX;
        else 
            if (this.x < 0)
                x = 0;
            else 
                x -= VELX;
    }
    public void actualizar(int x){
        this.x = x;
    }
}
