
package Ejercicio16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Nave extends Rectangle{
    public static final int ANCHURA = 20;
    public static final int ALTURA = 10;
    int velX, velY;
    
    public Nave() {
        super((int)(Math.random()*250),(int)(Math.random()*100),ANCHURA,ALTURA);
        velX = (int)(Math.random()*3)-3;
        velY = (int)(Math.random()*1)+1;
    }
    public void dibujar(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(this.x, this.y, this.width, this.height);
    }
    public void update() {
        x += velX;
        y += velY;
        if ((this.x <= 0) || (this.x >= 300-ANCHURA))
            velX = -velX;
    }
}
