
package Ejercicio20;

import java.awt.*;
import java.applet.Applet;
import java.util.List;
import java.util.ArrayList;


public class GameCircs extends Applet implements Runnable{
    public static final int TIEMPO = 10;
    
    Thread animacion;
    Image imagen;
    Graphics noseve;
    List<Circle> circles;
    
    public void init() {
        imagen = this.createImage(500,500);
        noseve = imagen.getGraphics();
        circles = new ArrayList<Circle>();
        circles.add(new Circle(20,240,240));
    }
        
    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }
    
    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint(Graphics g) {
        this.resize(500,500);
        noseve.setColor(Color.black);
        noseve.fillRect(0,0,500,500);
        
        for (int i=0; i<circles.size(); i++) {
            circles.get(i).paint(noseve);
        }
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            
            for (int j=0; j<circles.size(); j++) {
                circles.get(j).update();
            }
            
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch(InterruptedException e){};
        } while(true);
    }
    
    public boolean mouseDown(Event ev, int x, int y) {
        for (int l=0; l<circles.size(); l++) {
            if (circles.get(l).contains(x, y)) {
                int w2 = circles.get(l).width;
                circles.remove(l);
                if (w2 > 15) {                    
                    circles.add(new Circle(w2-1,x,y));
                    circles.add(new Circle(w2-1,x,y));
                }
                break;
            }
        }
        return true;
    }
}

/*

*/