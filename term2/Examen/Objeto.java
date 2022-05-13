// realizado por Eduardo Losilla Forradellas a 9 de marzo de 2021
package Examen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Objeto extends Rectangle{
    public static final Color colores[] = {Color.red,Color.blue,Color.green,Color.yellow,Color.orange,Color.pink};
    Color color;
    int velX = (int)(Math.random()*3)-3;
    int velY = (int)(Math.random()*2)-2;
    int cont = 0;
    boolean run = false;
    
    public Objeto() {
        super(((int)(Math.random()*100)),((int)(Math.random()*100)),15,15);
        color = colores[(int)(Math.random()*colores.length)];
    }
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(this.x, this.y, this.width, this.height);
    }
    public void update() {
        x += velX;
        y += velY;
        if (y<0 || y>500-height) {velY = -velY;}
        if (x<0 || x>500-width) {velX = -velX;}
        cont++;
    }
    public void accelerate() {
        run = true;
        velX = (velX != 0 && velX > 0) ? velX+1:velX-1; 
        velY = (velY != 0 && velY > 0) ? velY+1:velY-1;
        cont = 0;
    }
    public void slow() {
        velX = (velX != 0 && velX > 0) ? velX+1:velX-1; 
        velY = (velY != 0 && velY > 0) ? velY+1:velY-1;
        cont = 0;
        run = false;
    }
}
