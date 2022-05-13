
package Tercero;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Flecha extends Rectangle {
    public static final int VEL = 10;
    Image imagen;
    
    public Flecha(Image imagen, int y) {
        super(130,y,50,50);
        this.imagen = imagen;
        //imagen = this.getImage(this.getCodeBase(),"Tercero/imagenes/flecha");
    }
    
    public void paint(Graphics g, Applet a) {
        g.drawImage(imagen, this.x, this.y, this.width, this.height, a);
    }
    public void update() {
        this.x += VEL;
    }
}
