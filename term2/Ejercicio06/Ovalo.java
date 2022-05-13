
package Ejercicio06;
import Ejercicio05.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ovalo {
    int posX, posY, ancho, alto;
    Color color;
    Random r;
    
    public Ovalo(){
        r = new Random();
        inicializar();
    }

    public void inicializar() {
        // nextInt devuelve entre 0 y el número indicado INCLUIDO.
        posX = r.nextInt(200);
        posY = r.nextInt(200);
        ancho = r.nextInt(100);
        alto = r.nextInt(100);
        color  = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
    }
    
    public void dibujar(Graphics g){
        g.setColor(color);
        g.fillOval(posX, posY, ancho, alto);
        
    }
}
