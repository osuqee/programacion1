
package Septimo;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class MazoPalo extends Rectangle implements Mazo{
    int palo;
    public ArrayList<Carta> cartas;
    
    public MazoPalo(int posX) {
        super(posX,MazoSecundario.POSICIONY, Carta.WIDTH, Carta.HEIGHT);
        cartas = new ArrayList<Carta>();
    }
    public void paint(Graphics g, Applet a) {
        g.setColor(Color.BLACK);
        g.drawRect(x,y,width,height);
        for (int i=0; i<cartas.size(); i++) {
            cartas.get(i).paint(g, a); 
        }
    }
    public boolean addCard(Carta c) {
        if (cartas.isEmpty()){ 
            if (c.getValor()==1) {
                cartas.add(c);
                this.palo = c.getPalo();
                return true;
            }
        }else {
            if ((c.getPalo() == palo) && (c.getValor() == cartas.get(cartas.size()-1).getValor()+1)) {
                cartas.add(c);
                recolocar(c);
                return true;
            }
        }
        return false;
    }
    public void deleteCard() {
        cartas.remove(cartas.size()-1);
    }
    public Carta lastCard() {
        return cartas.get(cartas.size()-1);
    }
    /*public void recolocar() {
        cartas.get(cartas.size()-1).x = this.y;
        cartas.get(cartas.size()-1).y = this.y;
    }*/
    public void recolocar(Carta c) {
        c.x = this.x;
        c.y = this.y;
    }
}
