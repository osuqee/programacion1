
package Ejercicio15;

import java.awt.*;
import java.applet.Applet;
import java.util.List;
import java.util.ArrayList;

public class Flappy extends Applet implements Runnable {
    public static final int TIEMPO = 50;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Pajaro pajaro;
    public List<Columna> columnas;
    int tiempoAcumulado = 0;
    boolean fin = false;
    
    
    public void init() {
        imagen = this.createImage(300,300);
        this.resize(500,500);
        noseve = imagen.getGraphics();
        pajaro = new Pajaro();
        columnas = new ArrayList<Columna>();
        columnas.add(new Columna());
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
        pajaro.dibujar(noseve);
        for (int i=0; i<columnas.size(); i++)
            columnas.get(i).dibujar(noseve);
        if (fin) {
            noseve.setColor(Color.red);
            noseve.setFont(new Font("TimesRoman",Font.BOLD,24));
            noseve.drawString("Game Over",80,150);
        }
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            tiempoAcumulado += TIEMPO;
            if (tiempoAcumulado >= 2300) {
                tiempoAcumulado = 0;
                columnas.add(new Columna());
            }
            pajaro.actualizar();
            for (int o=0; o<columnas.size(); o++)
                columnas.get(o).actualizar();
            if (columnas.get(0).getArriba().x <= -30)
                columnas.remove(0);
            if ((pajaro.intersects(columnas.get(0).getArriba())) || (pajaro.intersects(columnas.get(0).getAbajo()))) {
                fin = true;
                repaint();
                animacion.stop();
            }
            
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch(InterruptedException e){};
        } while(true);
    }
    /*public boolean mouseDown(Event ev, int x, int y) {
        pajaro.y -= 25;
        return true; 
    }*/
    
    public boolean keyDown(Event ev, int tecla) {
        if (tecla == 32) {
            pajaro.y -= 25;
        }
        return true;
    }
}
