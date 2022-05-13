
package Quinto;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;


public class Ruleta extends Applet {
    public static final int TIEMPO = 100;
    public static final int FICHAS = 10;
    public static final int FILAS = 12;
    public static final int COLUMNAS = 3;
    public static final Color colores[] = {Color.red, Color.black};
    
    Image imagen;
    Graphics noseve;
    Image imagenes[];
    
    List<Ficha> fichasL[];
    int valores[] = {1,5,10,25,50,100,500,1000,5000,10000};
    Ficha actual;
    Casilla casillas[][];
    int rojos[] = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
    ArrayList<Integer> rojosL;
    Button boton;
    int numeros[];
    int numeroSuerte;
    int jugadas[];
    
    public void init () {
        this.resize(1000,700);
        imagen = this.createImage(1000,700);
        noseve = imagen.getGraphics();
        
        fichasL = new ArrayList[FICHAS];
        
        imagenes = new Image[FICHAS];
        
        for (int i=0; i<FICHAS; i++) {
            imagenes[i] = this.getImage(this.getCodeBase(),"Quinto/Fichas/ficha"+(i+1)+".png");
            fichasL[i] = new ArrayList<Ficha>();
            fichasL[i].add(new Ficha(imagenes[i],20+Ficha.DIM*i,valores[i]));
        }
        
        casillas = new Casilla[FILAS][COLUMNAS];
        
        rojosL = new ArrayList<Integer>();
        for (int m=0; m<rojos.length; m++) {
            rojosL.add(new Integer(rojos[m]));
        }
        
        for (int i=0; i<FILAS; i++) {
            for (int j=0; j<COLUMNAS; j++) {
                if (rojosL.contains((i*COLUMNAS)+j+1)) {
                    casillas[i][j] = new Casilla((j*Casilla.DIM)+10,(i*Casilla.DIM)+30,(i*COLUMNAS)+j+1,Color.red);
                } else {
                    casillas[i][j] = new Casilla((j*Casilla.DIM)+10,(i*Casilla.DIM)+30,(i*COLUMNAS)+j+1,Color.black);
                }
            }
        }
        
        boton = new Button("Jugar!");
        this.setLayout(new BorderLayout());
        this.add("North",boton);
        
        numeros = new int [10];
        for (int i=0; i<10; i++) {
            numeros[i] = 0;
        }
        
        jugadas = new int [10];
    }
    
    
    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint (Graphics g) {
        noseve.setColor(Color.green);
        noseve.fillRect(0,0,1000,700);
        
        for (int i=0; i<FILAS; i++)
            for (int j=0; j<COLUMNAS; j++)
                casillas[i][j].paint(noseve);
        
        for (int j=0; j<FICHAS; j++)
            for (int l=0; l<fichasL[j].size(); l++)
                fichasL[j].get(l).paint(noseve, this);
        
        noseve.setColor(Color.red);
        noseve.drawRect(290,40,40,40);
        
        resultado();
        
        g.drawImage(imagen,0,0,this);
    }

    public void resultado() {
        String frase = "";
        
        for (int i=0; i<jugadas.length; i++) {
            if (rojosL.contains(jugadas[i])) {
                noseve.setColor(Color.red);
                frase = "ROJO - ";
            } else {
                noseve.setColor(Color.black);
                frase = "NEGRO - ";
            }
            /*if (numeros[i]%2 == 0) {
            frase += "PAR - ";
            //noseve.drawString("" + numeros[i] + "    PAR",300,i*50+70);
            } else if (numeros[i]%2 == 1) {
            frase += "IMPAR - ";
            //noseve.drawString("" + numeros[i] + "    IMPAR",300,i*50+70);
            }*/
            frase += (jugadas[i]%2==0)?"PAR - ":"IMPAR - ";
            frase += (jugadas[i]<18)?"FALTA - ":"PASA - ";
            
            
            noseve.drawString("" + jugadas[i],300,i*50+70);
            noseve.setColor(Color.black);
            noseve.drawString(frase,400,500);
        }
    }
    
    public boolean mouseDown(Event ev, int x, int y) {
        for (int i=0; i<FICHAS; i++) {
            for (int j=0; j<fichasL[i].size(); j++) {
                if (fichasL[i].get(j).contains(x,y)) {
                    actual = fichasL[i].get(j);
                    fichasL[i].add(new Ficha(imagenes[i],20+Ficha.DIM*i,valores[i]));
                    break;
                }
            }
        }
        return true;
    }
    public boolean mouseDrag(Event ev, int x, int y) {
        if (actual != null) {
            actual.mover(x, y);
            repaint();
        }
        return true;
    }
    public boolean mouseUp(Event ev, int x, int y) {
        actual.cargarApostados(casillas);
        repaint();
        actual = null;
        return true;
    }
    
    public boolean action (Event ev, Object ob) {
        if (ev.target instanceof Button) {
            numeroSuerte = (int)(Math.random()*37);
            for (int i=numeros.length-1; i>0; i--) {
                jugadas[i] = jugadas[i-1];
            }
            jugadas[0] = numeroSuerte;
            
            
            repaint();
            return true;
        }
        return false;
    }
}    

// boton para que salga numero aleatorio arriba
// muestre los 10 ultimos numeros con su color (2 negro, 3 rojo, por ejemplo)
// poner un monedero
// informar a la derecha de las fichas de las ultimas jugadas realizadas
