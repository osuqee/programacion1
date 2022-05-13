package Sexto;

import java.awt.Image;
import java.util.ArrayList;

public class Baraja {
    public ArrayList<Carta>  cartas;
    
    public Baraja(Image imagenes[]){
        cartas = new ArrayList<Carta>();
        for (int i = 0; i < BlackJack.NUM_CARTAS; i++) {
            cartas.add(new Carta(imagenes[i], (i % BlackJack.CPP) + 1)); //valores entre (0 y 12) + 1
        }
        //Collections.shuffle(cartas) otra forma
    }
    
     public Carta darCarta(){ //sacar carta random
        Carta primeraCarta;
        int n = (int)(Math.random() * cartas.size());
        primeraCarta = this.cartas.get(n); //temporal
        this.cartas.remove(n);
        return primeraCarta;
    }
}