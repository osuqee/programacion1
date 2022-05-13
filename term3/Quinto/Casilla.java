
package Quinto;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Casilla extends Rectangle{
    public static final int DIM = 50;
    private int valor;
    Color color;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public Casilla (int x, int y, int valor, Color color) {
        super(x,y,DIM,DIM);
        this.valor = valor;
        this.color = color;
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawRect(x, y, width, height);
        g.setFont(new Font("TimesRoman",Font.BOLD, 24));
        g.setColor(color);
        g.drawString(""+valor, x+20, y+40);
    }
}
