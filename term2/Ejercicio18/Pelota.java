
package Ejercicio18;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Pelota extends Rectangle{
    int velX, velY;
    
    public Pelota() {
        super(250,250,15,15);
        velX = (int)(Math.random()*2)+1;
        velY = (int)(Math.random()*2)+1;
    }
    public void update() {
        x += velX;
        y += velY;
        if (y<0 || y>500-height) {velY = -velY;}
    }
    public void paint(Graphics g) {
        g.setColor(Color.pink);
        g.fillOval(this.x, this.y, this.width, this.height);
    }
}
