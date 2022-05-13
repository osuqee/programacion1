
package Ejercicio04;
import java.util.Random;

public class Bombo {
    private int bolas[];
    Random aleatorio;
    int numBolas = 48;
    
    public Bombo() {
        bolas = new int[numBolas];
        for (int i=0; i<numBolas; i++)
            bolas[i] = i+1;
        aleatorio = new Random();
    }
    
    public int sacarBola() {
        int iBola = aleatorio.nextInt(numBolas);
        int bola = bolas[iBola];
        bolas[iBola] = bolas[numBolas-1];
        numBolas--;
        return bola;
    }
}
