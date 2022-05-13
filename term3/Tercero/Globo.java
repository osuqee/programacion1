
package Tercero;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Globo extends Rectangle{
    public static final int VELY = 3;
    Image imagen;
    
    public Globo(Image imagen) {
        super(600,500,60,80);
        this.imagen = imagen;
    }
    
    public void paint(Graphics g, Applet a) {
        g.drawImage(imagen, x, y, width, height, a);
    }
    
    public void update() {
        this.y -= VELY;
    }
}
