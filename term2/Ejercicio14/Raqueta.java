
package Ejercicio14;

import java.awt.*;

public class Raqueta extends Bloque{    
    public static final int VELX = 7;
    
    public Raqueta () {
        super(30,250,50,15,Color.white);
    }
    
    public void dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillRect(this.x, this.y, this.width, this.height);
    }
    
    public void update(boolean irDer) {
        if (x < (300-width) && irDer == Arkanoid.DERECHA)
            this.x += VELX;
        else if (x > 0 && irDer == Arkanoid.IZQUIERDA)
            this.x -= VELX;
    }
}
