
package Ejercicio17;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Coche extends Rectangle {
    public static final Color colores[] = {Color.red,Color.blue,Color.green,Color.yellow,Color.orange,Color.pink};
    Color color;
    private int velX = 0;
    private int velY;
    int sentido = 0;

    public int getVelY() {
        return velY;
    }

    public void setVelY(int velY) {
        this.velY = velY;
    }

    public int getVelX() {
        return velX;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }
    
    public Coche() {
        super(0,0,30,20);
        velX = (Math.random() >= .5)?(int)(Math.random()*4)+2: -(int)(Math.random()*4)+2;
        velY = (int)(Math.random()*5)-2;
        x = (velX>0)?-30:500;
        y = (velX>0)?(int)(Math.random()*78)+152:(int)(Math.random()*78)+50;
        
        color = colores[(int)(Math.random()*colores.length)];
    }
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x,y,width,height);
    }
    public void update(Rectangle r1, Rectangle r2) {
        x += velX;
        y += velY;
        if (velX > 0) {
            if (!r2.contains(this))
                velY = -velY;
        } else 
            if (!r1.contains(this))
                velY = -velY;
    }
}
