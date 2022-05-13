
package Ejercicio13;

import java.applet.Applet;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Jugando extends Applet implements Runnable{
    public static final int NUMPELOTAS = 13;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    //Pelota pelotas[];
    public List<Pelota> pelotas;
    
    public void init() {
        imagen = this.createImage(300,300);
        noseve = imagen.getGraphics();
        pelotas = new ArrayList<Pelota>();
        for(int i=0; i<NUMPELOTAS; i++)
            pelotas.add(new Pelota());
    }
    
    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }
    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint(Graphics g) {
        noseve.setColor(Color.black);
        noseve.fillRect(0,0,300,300);
        for (int j=0; j<pelotas.size(); j++)
            pelotas.get(j).dibujar(noseve);
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            for (int k=0; k<pelotas.size(); k++)
                pelotas.get(k).actualizar();
            repaint();
            try {
                Thread.sleep(30);
            } catch(InterruptedException e){};
        } while(true);
    }
    public boolean mouseDown(Event ev, int x, int y) {
        for (int l=0; l<pelotas.size(); l++)
            if (pelotas.get(l).contains(x, y))
                pelotas.remove(l);
        return true;
    }
}
