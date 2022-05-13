
package Primero;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class DibujoAnimado {
    int x,y;
    private Image imagenes[];
    int actual = 0;
    int velX = (int)(Math.random()*10+1);
    
    public DibujoAnimado(Image imgs[]) {
        //habría que hacer 'extends Rectangle' al inicio.
        //super((int)(Math.random()*400),(int)(Math.random()*200),60,80);
        imagenes = imgs;
        x = (int)(Math.random()*400);
        y = (int)(Math.random()*200);
    }
    
    public void paint (Graphics g, Applet a) {
        g.drawImage(imagenes[actual],x,y,60,80,a);
        // g.drawImage(imagenes[actual],x,y,width,height,a);
    }
    public void update() {
        actual = (actual+1) % imagenes.length;
        x += velX;
        if (x > 500) {
            x = 0;
        }
    }

    public void setImagenes(Image[] imagenes) {
        this.imagenes = imagenes;
    }
}
