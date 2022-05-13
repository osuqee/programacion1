
package Septimo;

import java.applet.Applet;
import java.awt.Graphics;
        

public interface Mazo {
    public boolean addCard(Carta c);
    public void paint(Graphics g, Applet a);
    public void recolocar(Carta c);
    public Carta lastCard();
    public void deleteCard();
}
