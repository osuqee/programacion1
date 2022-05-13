
package Sexto;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;

public class Mano {
    ArrayList<Carta> cartas;
    int posY;
    int total;
    
    public Mano(int py) {
        cartas = new ArrayList<Carta>();
        posY = py;
    }
    public void agregar(Carta carta) {
        cartas.add(carta);
    }
    public void paint(Graphics g, Applet a) {
        for (int i=0; i<cartas.size(); i++) {
            //g.drawImage(cartas.get(i).imagen,i*20,100,140,posY,a);
            g.drawImage(cartas.get(i).imagen,i*20,posY,140,100,a);
        }
    }
    public int valorMano() {
        boolean as = false;
        for (int i=0; i<cartas.size(); i++) {
            if (cartas.get(i).valor == 1) {
                as = true;
            }
            total += cartas.get(i).valor;
        }
        if (total <= 11 && as) {
            total += 10;
        }
        return total;
    }
    public boolean seHaPasado() {
        return (valorMano() > 21);
    }
    public boolean menor17() {
        return (valorMano() < 17);
    }
}
