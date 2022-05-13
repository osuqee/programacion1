
package Ejercicio04;

public class EjecutableBombo {
    public static void main(String arg[]) {
        Bombo b;
        b = new Bombo();
        
        int bingo[][] = new int [6][8];
        
        for (int i=0; i<6; i++) {
            for (int j=0; j<8; j++) {
                bingo[i][j] = b.sacarBola();
                System.out.printf(" " + bingo[i][j]);
            }
            System.out.println();
        }
    }
}
