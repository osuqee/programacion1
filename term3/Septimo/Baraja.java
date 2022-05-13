package Septimo;

import Sexto.*;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    public ArrayList<Carta>  cartas;
    
    public Baraja(Image imagenes[]){
        cartas = new ArrayList<Carta>();
        for (int i = 0; i < BlackJack.NUM_CARTAS; i++) {
            cartas.add(new Carta(imagenes[i], (i % 13) + 1, ((i/13)==0 || (i/13)==3)?Carta.NEGRO:Carta.ROJO,(i/13)));
        }
        Collections.shuffle(cartas); //otra forma
    }
    
    public Carta darCarta(){ //sacar carta random
        Carta primeraCarta;
        int n = (int)(Math.random() * cartas.size());
        primeraCarta = this.cartas.get(n); //temporal
        this.cartas.remove(n);
        return primeraCarta;
    }
    public boolean isEmptyDeck() {
        return cartas.size() == 0;
    }
}