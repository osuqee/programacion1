
package Ejercicio18;

import java.awt.*;
import java.applet.Applet;
import java.util.List;
import java.util.ArrayList;


public class Juego extends Applet implements Runnable{
    public static final int TIEMPO = 10;
    public static final Color colrs[] = {Color.gray, Color.red};
    public static final int WIN_COND = 10;
    
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Rectangle r1, r2;
    List<Pelota> pelotas;
    int marcador1, marcador2;
    int sC1, sC2;
    int cont = 0;
    int sM1, sM2;
    boolean chill = false;
    
    public void init() {
        imagen = this.createImage(500,500);
        noseve = imagen.getGraphics();
        r1 = new Rectangle(60,170,20,70);
        r2 = new Rectangle(420,170,20,70);
        pelotas = new ArrayList<Pelota>();
        pelotas.add(new Pelota());
        marcador1 = 0;
        marcador2 = 0;
        sM1 = 0;
        sM2 = 0;
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
        noseve.setColor(colrs[sM1]);
        noseve.fillRect(r1.x,r1.y,r1.width,r1.height);
        noseve.setColor(colrs[sM2]);
        noseve.fillRect(r2.x,r2.y,r2.width,r2.height);
        
        pelotas.get(0).paint(noseve);
        noseve.setFont(new Font("TimeRoman",Font.BOLD,30));
        noseve.setColor(Color.yellow);
        noseve.drawString(marcador1 + " - " + marcador2,213,50);
        
        noseve.setColor(Color.blue);
        noseve.fillRect(70,460,100,14);
        noseve.fillRect(330,460,100,14);
        noseve.setColor(Color.red);
        noseve.fillRect(71,461,sC1,12);
        noseve.fillRect(429-sC2,461,sC2,12);
        
        if (marcador1 == WIN_COND) {
            noseve.drawString("PLAYER 1 WINS.",150,100);
            noseve.setFont(new Font("TimeRoman",Font.BOLD,10));
            noseve.drawString("congratulations :D!!",270,120);
            animacion.stop();
        } else if (marcador2 == WIN_COND) {
            noseve.drawString("PLAYER 2 WINS.",150,100);
            noseve.setFont(new Font("TimeRoman",Font.BOLD,10));
            noseve.drawString("congratulations :D!!",270,120);
            animacion.stop();
        }
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            cont++;
            if (cont >=5){
                cont=0;
                sC1++;
                sC2++;
            }
            if (sC1 >= 99) {sC1 = 98;}
            if (sC2 >= 99) {sC2 = 98;}
            
            if (pelotas.get(0).intersects(r1) || pelotas.get(0).intersects(r2)) {
                if (pelotas.get(0).intersects(r1) && sM1 == 1 && sC1 >= 98) {
                    pelotas.get(0).velX = 7;
                    pelotas.get(0).velY = 0;
                    chill = true;
                    sC1 = 0;
                    sM1 = 0;
                } else if (pelotas.get(0).intersects(r2) && sM2 == 1 && sC2 >= 98) {
                    pelotas.get(0).velX = -7;
                    pelotas.get(0).velY = 0;
                    chill = true;
                    sC2 = 0;
                    sM2 = 0;
                } else {
                    chill = false;
                    pelotas.get(0).velX = -pelotas.get(0).velX;
                    pelotas.get(0).velY = (int)(Math.random()*9)-4;
                }
            }
            
            if (pelotas.get(0).x<5 || pelotas.get(0).x+pelotas.get(0).width>495) {
                pelotas.add(new Pelota());
                if (pelotas.get(0).x<5) {
                    pelotas.get(1).velX = -pelotas.get(1).velX;
                    marcador2++;
                } else if (pelotas.get(0).x+pelotas.get(0).width>495) {
                    marcador1++;
                }                    
                pelotas.remove(0);
            }
            
            pelotas.get(0).update();
            noseve.fillRect(r1.x,r1.y,r1.width,r1.height);
            noseve.fillRect(r2.x,r2.y,r2.width,r2.height);
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch(InterruptedException e){};
        } while(true);
    }
    
    public boolean keyDown(Event ev, int tecla) {
        if (tecla == Event.UP) {
            r2.y -= 30;
        } else if (tecla == Event.DOWN) {
            r2.y += 30;
        } else if (tecla == Event.RIGHT && sC2 >= 98){
            sM2 = (sM2 == 0)?1:0;
        } else if (ev.key == 'w') {
            r1.y -= 30;
        } else if (ev.key == 's') {
            r1.y += 30;
        } else if (ev.key == 'd' && sC1 >= 98) {
            sM1 = (sM1 == 0)?1:0;
        }
        
        return true;
    }
}
