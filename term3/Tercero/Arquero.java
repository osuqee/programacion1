
package Tercero;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Arquero extends Rectangle {
    Image imagen;
    
    public Arquero(Image imagen) {
        super(30,20,130,120);
        this.imagen = imagen;
    }
    
    public void paint(Graphics g, Applet a) {
        g.drawImage(imagen, this.x, this.y, this.width, this.height, a);
    }
    
    public void move(int y) {
        this.y = y;
    }
}
