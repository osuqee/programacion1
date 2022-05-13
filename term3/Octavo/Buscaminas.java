package Octavo;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;


public class Buscaminas extends Applet{
    public static final int DIM = 10;
    Image mina;
    Image imgReverso;
    Casilla casillas[][];
    
    public void init(){
        this.resize(1000,700);
        imgReverso = getImage(getCodeBase(),"Octavo/Imagenes/casilla.png");
        mina = getImage(getCodeBase(),"Octavo/Imagenes/mina.png");
        casillas = new Casilla [DIM][DIM];
        for (int a=0; a<DIM; a++) {
            for (int b=0; b<DIM; b++) {
                casillas[a][b] = new Casilla(100+(a*Casilla.TAM),100+(b*Casilla.TAM),imgReverso);
            }
        }
    }
    
    public void update(Graphics g){ 
        paint(g); //para no borrar
    }
    
    public void paint(Graphics g){
        for (int c=0; c<DIM; c++) {
            for (int d=0; d<DIM; d++) {
                casillas[c][d].paint(g, this);
            }
        }
    }
    
    public boolean mouseDown(Event e, int x, int y) {
        
        return true;
    }
}