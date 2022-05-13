
package Ejercicio12;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangulo {
    public static final int ARRIBA = 0;
    public static final int ABAJO = 1;
    public static final int IZQUIERDA = 2;
    public static final int DERECHA = 3;
    int posX, posY, ancho, alto;
    Color color;
    int direccion;
    int cont = 0;
    
    public Rectangulo(int posX, int posY, int ancho, int alto, Color c) {
        this.posX = posX;
        this.posY = posY;
        this.ancho = ancho;
        this.alto = alto;
        color = c;
        direccion = DERECHA;
    }
    
    public void dibujar (Graphics g) {
        g.setColor(color);
        g.fillRect(posX, posY, ancho, alto);
    }
    
    public void actualizar() {
        switch(direccion) {
            case ARRIBA:
                posY--;
                cont++;
                if (cont == 20) {
                    direccion = DERECHA;
                    cont = 0;
                }
                break;
            case ABAJO:
                posY++;
                cont++;
                if (cont == 20) {
                    direccion = IZQUIERDA;
                    cont = 0;
                }
                break;
            case IZQUIERDA:
                posX--;
                cont++;
                if (cont == 20) {
                    direccion = ARRIBA;
                    cont = 0;
                }
                break;
            case DERECHA:
                posX++;
                cont++;
                if (cont == 20) {
                    direccion = ABAJO;
                    cont = 0;
                }
        }
    }
}
