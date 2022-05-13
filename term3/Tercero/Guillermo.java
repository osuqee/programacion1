
package Tercero;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;


public class Guillermo extends Applet implements Runnable{
    public static final int TIEMPO = 10;
    
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Image imagenes[];
    
    Arquero archer;
    
    List<Flecha> arrows;
    Image arrowI;
    
    Image[] globosImg;
    Globo globo;
    
    public void init () {
        this.resize(700,500);
        imagen = this.createImage(700,500);
        noseve = imagen.getGraphics();
        
        archer = new Arquero(this.getImage(this.getCodeBase(),"Tercero/imagenes/arquero.png"));
        
        arrows = new ArrayList<Flecha>();
        arrowI = this.getImage(this.getCodeBase(),"Tercero/imagenes/flecha.png");
        
        globosImg = new Image[3];
        for (int i=0; i<3; i++) {
            globosImg[i] = this.getImage(this.getCodeBase(),"Tercero/imagenes/globo"+ (i+1) + ".png");
        }
        globo = new Globo(globosImg[(int)(Math.random()*3)]);
    }
    
    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }
    
    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint (Graphics g) {
        noseve.setColor(Color.pink);
        noseve.fillRect(0,0,700,500);
        
        archer.paint(noseve, this);
        
        for(int i=0; i<arrows.size(); i++) {
            arrows.get(i).paint(noseve,this);
        }
        
        globo.paint(noseve, this);
        
        g.drawImage(imagen,0,0,this);
    }
    
    public void run () {
        do {
            for (int i=0; i<arrows.size(); i++) {
                arrows.get(i).update();
                if (arrows.get(i).x > 700) {
                    arrows.remove(i);
                }
            }
            
            globo.update();
            
            repaint();
            try{
                Thread.sleep(TIEMPO);
            }catch(InterruptedException e){}
        } while (true);
    }
    
    public boolean mouseDown(Event ev, int x, int y) {
        arrows.add(new Flecha(arrowI,archer.y+26));
        repaint();
        return true;
    }
    public boolean mouseMove(Event ev, int x, int y) {
        archer.move(y-60);
        repaint();
        return true;
    }
}

