/*
 * Modificar la tabla de manera que convirtais los numeros negativos en positivos
 * y a los numeros positivos los multipliqueis por 5. 
 */
package primera;

public class Ejercicio027 {
    public static void main(String arg[]) {
        int tabla[][]={{1,2,-3,4},{-5,-6,7,8}};
        for (int i=0; i<tabla.length; i++) {
            for (int j=0; j<tabla[i].length; j++) {
                if (tabla[i][j] > 0)
                    tabla[i][j] *= 5;
                else
                    tabla[i][j] *= -1;
                System.out.printf("%d ",tabla[i][j]);
            }
            System.out.println();
        }
    }
}
