
package Ejercicio10;
import java.awt.Graphics;

public class DosPuntos {
    public static final int LINEA = 0;
    public static final int OVALO = 1;
    public static final int RECTANGULO = 2;
    
    private int inicioX, inicioY, finalX, finalY;
    private int tipo;
    
    public void dibujar(Graphics g) {
        int anchura, altura;
        anchura = Math.abs(finalX-inicioX);
        altura = Math.abs(finalY-inicioY);
        switch (tipo) {
            case LINEA:
                g.drawLine(inicioX, inicioY, finalX, finalY);
                break;
            case OVALO:
                g.drawOval(inicioX, inicioY, anchura, altura);
                break;
            case RECTANGULO:
                g.drawRect(inicioX, inicioY, anchura, altura);
        }
    }

    public DosPuntos(int ix, int iy, int fx, int fy, int tipo) {
        inicioX = ix;
        inicioY = iy;
        finalX = fx;
        finalY = fy;
        this.tipo = tipo;
    }

    public int getInicioX() {
        return inicioX;
    }

    public void setInicioX(int inicioX) {
        this.inicioX = inicioX;
    }

    public int getInicioY() {
        return inicioY;
    }

    public void setInicioY(int inicioY) {
        this.inicioY = inicioY;
    }

    public int getFinalX() {
        return finalX;
    }

    public void setFinalX(int finalX) {
        this.finalX = finalX;
    }

    public int getFinalY() {
        return finalY;
    }

    public void setFinalY(int finalY) {
        this.finalY = finalY;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public DosPuntos(int ix, int iy, int tipo) {
        this(ix,iy,ix,iy,tipo);
    }
    public DosPuntos() {
        this(0,0,LINEA);
    }
}
