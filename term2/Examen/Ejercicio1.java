// realizado por Eduardo Losilla Forradellas a 9 de marzo de 2021
package Examen;

import java.awt.*;
import java.applet.Applet;
import java.util.List;
import java.util.ArrayList;


public class Ejercicio1 extends Applet implements Runnable{
    public static final int TIEMPO = 10;
    
    Thread animacion;
    Image imagen;
    Graphics noseve;
    List<Objeto> objetos;
    
    public void init() {
        imagen = this.createImage(500,500);
        noseve = imagen.getGraphics();
        objetos = new ArrayList<Objeto>();
        for (int i=0; i<10; i++)
            objetos.add(new Objeto());
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
        
        for (int i=0; i<objetos.size(); i++) {
            objetos.get(i).paint(noseve);
            if (objetos.get(i).cont >= 200 && objetos.get(i).run) {
                objetos.get(i).slow();
            }
        }
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            
            for (int i=0; i<objetos.size(); i++) {
                objetos.get(i).update();
            }
            
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch(InterruptedException e){};
        } while(true);
    }
    
    public boolean mouseDown(Event ev, int x, int y) {
        for (int i=0; i<objetos.size(); i++) {
            if (objetos.get(i).contains(x, y)) {
                objetos.get(i).accelerate();
                break;
            }
        }
        return true;
    }
}
