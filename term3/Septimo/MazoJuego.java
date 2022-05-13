
package Septimo;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class MazoJuego extends Rectangle implements Mazo{
    public static final int POSY = 200;
    public ArrayList<Carta> cartas;
    
    public MazoJuego(int x) {
        super(x,POSY,Carta.WIDTH,Carta.HEIGHT);
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
        if (cartas.size()==0) {
            if (c.getValor()==13) {
                cartas.add(c);
                recolocar(c);
                return true;                
            }
            return false;
        } else {
            if (cartas.get(cartas.size()-1).getColor() != c.getColor() &&
                    cartas.get(cartas.size()-1).getValor() == c.getValor()+1) {
                cartas.add(c);
                recolocar(c);
                return true;
            }
        }
        return false;
    }
    public Carta lastCard() {
        return cartas.get(cartas.size()-1);
    }
    public void deleteCard() {
        cartas.remove(cartas.size()-1);
    }
    /*public void recolocar() {
        lastCard().x = this.x;
        if (cartas.size() == 1)
            lastCard().y = this.y;
        else         
            lastCard().y = this.y + (this.cartas.size()-1)*30;
    }*/
    public void recolocar (Carta c) {
        c.x = this.x;
        c.y = this.y + (this.cartas.size()-1)*30;
    }
}
