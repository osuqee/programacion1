
package Ejercicio16;

import java.awt.*;
import java.applet.Applet;
import java.util.List;
import java.util.ArrayList;


public class Juego extends Applet implements Runnable{
    public static final int TIEMPO = 10;
    public static final boolean DERECHA = true;
    public static final boolean IZQUIERDA = false;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Gun gun;
    List<Bala> balas;
    List<Nave> naves;
    int intervalo = 0;
    String mensaje = null;
    
    public void init() {
        imagen = this.createImage(300,500);
        noseve = imagen.getGraphics();
        gun = new Gun();
        balas = new ArrayList<Bala>();
        naves = new ArrayList<Nave>();
        mensaje = null;
        for (int i=0; i<10; i++)
            naves.add(new Nave());
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
        noseve.fillRect(0,0,300,500);
        gun.paint(noseve);
        for (int i=0; i<balas.size(); i++)
            balas.get(i).dibujar(noseve);
        for (int k=0; k<naves.size(); k++)
            naves.get(k).dibujar(noseve);
        if (mensaje != null) {
            noseve.setFont(new Font("TimesRoman",Font.BOLD,24));
            noseve.drawString(mensaje,75,100);
        }
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            for (int t=0; t<balas.size(); t++)
                balas.get(t).actualizar();
            for (int l=0; l<naves.size(); l++)
                naves.get(l).update();
            if (balas.size() > 0 && balas.get(0).y <= 4) 
                balas.remove(0);
            
            intervalo += TIEMPO;
            if (intervalo >= 5000) {
                intervalo = 0;
                naves.add(new Nave());
            }
            
            for (int m=0; m<balas.size(); m++)
                for (int n=0; n<naves.size(); n++)
                    if (balas.get(m).intersects(naves.get(n))) {
                        balas.remove(m);
                        naves.remove(n);
                    }
            
            for (int o=0; o<naves.size(); o++)
                if (naves.get(o).y >= 500) {
                    mensaje = "GAME OVER";
                    noseve.setFont(new Font("TimesRoman",Font.BOLD,24));
                    repaint();
                    animacion.stop();
                }
            
            if (naves.size() == 0) {
                mensaje = "WINNEERRR";
                noseve.setFont(new Font("TimesRoman",Font.BOLD,24));
                repaint();
                animacion.stop();
            }
            
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch(InterruptedException e){};
        } while(true);
    }
    
    public boolean mouseMove(Event eve, int x, int y){
        gun.actualizar(x);
        return true;
    }
    
    public boolean mouseDown(Event eve, int x, int y){
        balas.add(new Bala(x + 10));
        return true;
    }
    
    public boolean keyDown(Event ev, int tecla) {
        if (tecla == 1006) gun.actualizar(IZQUIERDA);
        else if (tecla == 1007) gun.actualizar(DERECHA);
        else if (tecla == 32) { //SPACEBAR
            balas.add(new Bala(gun.x+6));
            repaint();
        }
        return true;
    }
}
