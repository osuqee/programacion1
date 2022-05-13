
package Ejercicio19;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class Obstaculo extends Rectangle{
    public Obstaculo () {
        super(520,270,30,30);
    }
    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(this.x, this.y, this.width, this.height);
    }
    public void update() {
        this.x -= 5;
    }
}
