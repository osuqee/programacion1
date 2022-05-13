
package Ejercicio14;

import java.awt.*;


// abstract, indica que no se pueden instanciar objetos de esta clase
public abstract class Bloque extends Rectangle{
    // hereda x,y,width,height
    public static final Color COLORES[] = {Color.white,Color.pink,Color.orange,Color.gray,Color.red};
    Color color;
    
    public Bloque(int x, int y, int width, int height, Color color) {
        super(x, y, width, height);
        this.color = color;
    }
    
    //abstract aqui indica que las subclases que hereden de esta tengan que 
    // tener un metodo dibujar por obligacion. 
    public abstract void dibujar(Graphics g);
}
