
package Ejercicio17;

import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.List;

public class Rana extends Rectangle {
    public static final int VEL = 7;
    
    public Rana() {
        super(140,263,20,20);
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(x,y,width,height);
    }
    
    public boolean choque(List<Coche> lista) {
        for (int i=0; i<lista.size(); i++)
            if (this.intersects(lista.get(i))) {
                lista.remove(i);
                return true;
            }
        return false;
    }
    
    public void update(int direccion) {
        switch(direccion) {
            case Event.UP: // arriba
                y -= VEL;
                break;
            case Event.DOWN: // abajo
                y += VEL;
                break;
            case Event.LEFT: // izquierda 
                x -= VEL;
                break;
            case Event.RIGHT: // derecha
                x += VEL;
                break;
        }
    }
}
