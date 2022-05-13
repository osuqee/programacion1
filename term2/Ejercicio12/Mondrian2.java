
package Ejercicio12;

import java.applet.Applet;
import java.awt.*;

public class Mondrian2 extends Applet implements Runnable{
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Rectangulo rectangulos[];
    int posXs[] = {0,250,80,80,100,80,200,0,200};
    int posYs[] = {0,0,160,220,10,100,0,110,55,0};
    int anchos[] = {90,40,100,220,90,110,45,70,60};
    int altos[] = {90,190,120,90,80,90,45,200,135};
    Color colores[] = {Color.yellow,Color.yellow,Color.yellow,Color.blue,Color.blue,Color.lightGray,Color.red,Color.red,Color.magenta};
    
    public void init() {
        imagen = this.createImage(300,300);
        noseve = imagen.getGraphics();
        rectangulos = new Rectangulo [9];
        for (int i=0; i<rectangulos.length; i++)
            rectangulos[i] = new Rectangulo(posXs[i],posYs[i],anchos[i],altos[i],colores[i]);
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
        for (int j=0; j<rectangulos.length; j++)
            rectangulos[j].dibujar(noseve);
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            for (int k=0; k<9; k++)
                rectangulos[k].actualizar();
            repaint();
            try {
                Thread.sleep(10);
            } catch(InterruptedException e){};
        } while(true);
    }
}
