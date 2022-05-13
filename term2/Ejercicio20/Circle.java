
package Ejercicio20;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Circle extends Rectangle{
    int VELX = (int)(Math.random()*2)-2;
    int VELY = (int)(Math.random()*2)-2;
    
    public Circle(int diam, int x, int y) {
        super(x,y,diam,diam);
    }
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        if (width == 15) {g.setColor(Color.red);}
        g.fillOval(this.x, this.y, this.width, this.height);
    }
    public void update() {
        x += VELX;
        y += VELY;
        if (y<0 || y>500-height) {VELY = -VELY;}
        if (x<0 || x>500-width) {VELX = -VELX;}
    }
}
