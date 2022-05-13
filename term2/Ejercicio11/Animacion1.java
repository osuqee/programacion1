
package Ejercicio11;

import java.awt.*;

public class Animacion1 extends Frame implements Runnable{
    Thread animacion;
    public int actual = 0;
    String frames[] = {"*","**","***","****","*****","******","*******","******","*****","****","***","**","*"};
    
    public static void main(String args[]) {
        Animacion1 app = new Animacion1();
    }
    public Animacion1() {
        super("Animacion sencilla");
        pack();
        resize(400,400);
        show();
        animacion = new Thread(this); //animacion es quien llama al método run.
        animacion.start();
    }
    public void paint(Graphics g) {
        g.drawString(frames[actual], 50, 100);
    }
    public void run() {
        do {
            actual = (actual+1) % frames.length;
            repaint();
            try {
                Thread.sleep(200);
            } catch(InterruptedException e){};
        } while(true);
    }
    
    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        }
        return false;
    }
}
