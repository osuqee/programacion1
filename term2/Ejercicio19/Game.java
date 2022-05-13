
package Ejercicio19;

import java.awt.*;
import java.applet.Applet;
import java.util.List;
import java.util.ArrayList;


public class Game extends Applet implements Runnable{
    public static final int TIEMPO = 10;
    
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Player player1;
    List<Obstaculo> trozos;
    int cont = 0;
    
    public void init() {
        imagen = this.createImage(500,500);
        noseve = imagen.getGraphics();
        player1 = new Player();
        trozos = new ArrayList<Obstaculo>();
        trozos.add(new Obstaculo());
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
        noseve.setColor(Color.gray);
        noseve.fillRect(0,300,500,200);
        
        player1.paint(noseve);
        
        for (int i=0; i<trozos.size(); i++) {
            trozos.get(i).paint(noseve);
        }
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            
            cont++;
            if (cont >= 75) {
                trozos.add(new Obstaculo());
                cont = 0;
            }
            
            for (int i=0; i<trozos.size(); i++) {
                trozos.get(i).update();
            }
            
            if (trozos.get(0).x < -50) {
                trozos.remove(0);
            }
            
            player1.update();
            
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch(InterruptedException e){};
        } while(true);
    }
    
    public boolean keyDown(Event ev, int tecla) {
        if (tecla == 32) {
            player1.saltar();
            repaint();
        }
        
        return true;
    }
}
