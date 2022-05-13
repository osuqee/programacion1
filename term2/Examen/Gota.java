// realizado por Eduardo Losilla Forradellas a 9 de marzo de 2021
package Examen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Gota extends Rectangle{
    int VELY = (int)(Math.random()*6);
    
    public Gota() {
        super((int)(Math.random()*500),-20,3,7);
    }
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(this.x, this.y, this.width, this.height);
    }
    public void update() {
        y += VELY;
    }
}
