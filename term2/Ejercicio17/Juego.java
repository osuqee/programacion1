
package Ejercicio17;

import java.awt.*;
import java.applet.Applet;
import java.util.List;
import java.util.ArrayList;


public class Juego extends Applet implements Runnable{
    public static final int TIEMPO = 10;
    
    Thread animacion;
    Image imagen;
    Graphics noseve;
    List<Coche> coches;
    int intervalo = 0;
    Rana rana;
    int vidas = 3;
    Rectangle r1;
    Rectangle r2;
    
    public void init() {
        imagen = this.createImage(300,500);
        noseve = imagen.getGraphics();
        coches  = new ArrayList<Coche>();
        for (int j=0; j<5; j++)
            coches.add(new Coche());
        rana = new Rana();
        r1 = new Rectangle(-30,50,560,98);
        r2 = new Rectangle(-30,152,560,98);
    }
        
    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }
    
    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint(Graphics g) {
        this.resize(300,300);
        noseve.setColor(Color.white);
        noseve.fillRect(0,0,500,300);
        noseve.setColor(Color.black);
        noseve.fillRect(r1.x,r1.y,r1.width,r1.height);
        noseve.fillRect(r2.x,r2.y,r2.width,r2.height);
        
        for (int i=0; i<coches.size(); i++)
            coches.get(i).paint(noseve);
        rana.paint(noseve);
        noseve.setColor(Color.red);
        noseve.drawString("Vidas_ "+vidas,10,10);
        if (vidas == 0) {
            noseve.setFont(new Font("TimeRoman",Font.BOLD,20));
            noseve.setColor(Color.yellow);
            noseve.drawString("GAME OVER",100,130);
            animacion.stop();
        }
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            
            intervalo += TIEMPO;
            if (intervalo >= 300) {
                intervalo = 0;
                coches.add(new Coche());
            }
            
            for (int k=0; k<coches.size(); k++) {
                coches.get(k).update(r1,r2);
                if (coches.get(k).getVelX() > 0 ) {
                    if (coches.get(k).x  >= 500)
                        coches.remove(k);
                } else
                    if (coches.get(k).x <= -30)
                        coches.remove(k);
            }
            
            if (rana.choque(coches))
                vidas--;
            
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch(InterruptedException e){};
        } while(true);
    }
    
    public boolean keyDown(Event ev, int tecla) {
        rana.update(tecla);
        return true;
    }
}
