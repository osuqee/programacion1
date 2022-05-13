package Sexto;

import java.applet.Applet;
import java.awt.*;

public class Carta{
    Image imagen;
    int valor;
    private int posx, posy;

    //getters y setters
    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }
    
    //constructor
    public Carta(Image img, int valor){
        imagen = img;
        this.valor = (valor > 10)?10:valor;
    }
    
    /*public void paint(Graphics g, Applet a){
        g.drawImage(imagen, posx, posy, 70, 100, a);
    }*/
    
}