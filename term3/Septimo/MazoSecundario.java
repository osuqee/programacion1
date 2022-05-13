
package Septimo;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;

public class MazoSecundario implements Mazo{
    public ArrayList<Carta> cartas;
    public static final int POSICIONX = 110;
    public static final int POSICIONY = 20;
    
    public MazoSecundario() {
        cartas = new ArrayList<Carta>();
    }
    
    public boolean addCard(Carta c) {
        cartas.add(c);
        recolocar(c);
        return true;
    }
    public void paint(Graphics g, Applet a) {
        for (int i=0; i<cartas.size(); i++) {
            cartas.get(i).paint(g, a);
        }
    }
    /*public void recolocar() {
        cartas.get(cartas.size()-1).x = POSICIONX;
        cartas.get(cartas.size()-1).y = POSICIONY;
    }*/
    public void recolocar(Carta carta) {
        carta.x = POSICIONX;
        carta.y = POSICIONY;
    }
    public Carta lastCard() {
        // no elimina la carta del mazo, simplemente la muestra
        return cartas.get(cartas.size()-1);
    }
    public void deleteCard() {
        cartas.remove(cartas.size()-1);
    }
}
