/*
Cambiar diagonales de una tabla.
*/
package primera;


public class Ejercicio040 {
    public static void main(String arg[]){
        int tabla[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int aux = 0;
        for (int i = 0; i < tabla.length; i++){ //También se podría poner otro bucle descente
            aux = tabla[i][i];
            tabla[i][i] = tabla[i][tabla.length - i - 1];
            tabla[i][tabla.length - i - 1] = aux; 
        }
        
        for(int i = 0; i < tabla.length; i++){
            for (int j = 0; j < tabla[i].length ; j++)
                System.out.printf(" %d ", tabla[i][j]);
            System.out.println();
        }
    }
}