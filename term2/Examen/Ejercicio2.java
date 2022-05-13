// realizado por Eduardo Losilla Forradellas a 9 de marzo de 2021
package Examen;

import java.awt.*;
import java.applet.Applet;
import java.util.List;
import java.util.ArrayList;


public class Ejercicio2 extends Applet implements Runnable{
    public static final int TIEMPO = 10;
    
    Thread animacion;
    Image imagen;
    Graphics noseve;
    List<Gota> lluvia;
    
    public void init() {
        imagen = this.createImage(500,500);
        noseve = imagen.getGraphics();
        lluvia = new ArrayList<Gota>();
        lluvia.add(new Gota());
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
        
        for (int i=0; i<lluvia.size(); i++) {
            lluvia.get(i).paint(noseve);
        }
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            
            lluvia.add(new Gota());
            
            for (int i=0; i<lluvia.size(); i++) {
                lluvia.get(i).update();
            }
            
            for (int i=0; i<lluvia.size(); i++) {
                if (lluvia.get(i).x > 500) {
                    lluvia.remove(i);
                }
            }
            
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch(InterruptedException e){};
        } while(true);
    }
}
