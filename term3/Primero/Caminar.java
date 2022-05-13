
package Primero;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.List;
import java.util.ArrayList;

public class Caminar extends Applet implements Runnable{
    public static final int TIEMPO = 100;
    boolean fin = false;
    
    Thread animacion;
    Image imagen;
    Graphics noseve;
    
    Image fotogramas[][];
    String RUTA_BASE = "Primero/Sprites/";
    DibujoAnimado dibujo;
    List<DibujoAnimado> dibujos;
    
    DibujoAnimado shyguy;
    Image framesSG[];
    
    public void init () {
        this.resize(500,300);
        imagen = this.createImage(500,300);
        noseve = imagen.getGraphics();
        fotogramas = new Image[3][4];
        String elementos[] = {"Guerrillero/g","Hampon/h","Vaquero/v","shyguy/sg"};
        for (int i=0; i<3; i++) {
            for (int j=0; j<4; j++) {
                fotogramas[i][j] = this.getImage(this.getCodeBase(),RUTA_BASE + elementos[i] + (j+1) + ".gif");
            }        
        }
        dibujo = new DibujoAnimado(fotogramas[1]);
        dibujos = new ArrayList<DibujoAnimado>();
        for (int i=0; i<10; i++) {
            dibujos.add(new DibujoAnimado(fotogramas[(int)(Math.random()*3)]));
        }
        
        framesSG = new Image[12];
        for (int k=0; k<12; k++){framesSG[k] = this.getImage(this.getCodeBase(),RUTA_BASE + elementos[3] + (k+1) + ".gif");}
        shyguy = new DibujoAnimado(framesSG);
        shyguy.velX = 20;
    }
    
    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }
    
    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint (Graphics g) {
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0,0,500,300);
        dibujo.paint(noseve, this);
        for (int j=0; j<dibujos.size(); j++) {
            dibujos.get(j).paint(noseve,this);
        }
        shyguy.paint(noseve, this);
        g.drawImage(imagen,0,0,this);
        
        if (fin) {
            noseve.setColor(Color.white);
            noseve.setFont(new Font("Arial", Font.BOLD, 24));
            noseve.drawString("GAME OVER.",150,100);
            //noseve.setFont(new Font("TimeRoman",Font.BOLD,10));
            //repaint();
            animacion.stop();
        }
    }
    
    public void run() {
        do {
            dibujo.update();
            for (int j=0; j<dibujos.size(); j++) {
                dibujos.get(j).update();
            }
            shyguy.update();
            
            if(dibujos.isEmpty())
                fin = true;
            
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch(InterruptedException e){};
        } while(true);
    }
    
    public boolean mouseDown(Event ev, int x, int y) {
        Rectangle area = new Rectangle(0,0,60,80);
        for (int m=0; m<dibujos.size(); m++) {
            area.x = dibujos.get(m).x;
            area.y = dibujos.get(m).y;
            if (area.contains(x, y)) {
                dibujos.remove(m);
                break;
            }
        }
        
        return true;
    }
    
    /*public boolean keyDown(Event ev, int tecla) {
        switch (ev.key) {
            case 'g':
                dibujo.setImagenes(fotogramas[0]);
                for (int l=0; l<dibujos.size(); l++) {
                    dibujos.get(l).setImagenes(fotogramas[0]);
                }
                break;
            case 'h':
                dibujo.setImagenes(fotogramas[1]);
                for (int l=0; l<dibujos.size(); l++) {
                    dibujos.get(l).setImagenes(fotogramas[1]);
                }
                break;
            case 'v':
                dibujo.setImagenes(fotogramas[2]);
                for (int l=0; l<dibujos.size(); l++) {
                    dibujos.get(l).setImagenes(fotogramas[2]);
                }
        }
        return true;
    }*/
}
