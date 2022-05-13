
package Ejercicio19;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends Rectangle{
    public static final int SALTO = 100;
    public static final int GRAVITY = 3;
    
    public Player() {
        super(30,270,30,30);
    }
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(this.x, this.y, this.width, this.height);
    }
    public void update() {
        if (this.y < 270) {
            this.y += GRAVITY;
        } else if (this.y >= 270) {
            this.y = 270;
        }
    }
    public void saltar() {
        if (this.y == 270)
            this.y -= SALTO;
    }
}
