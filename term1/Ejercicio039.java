
package primera;

public class Ejercicio039 {
    public static void main(String arg[]) {
        int tabla1[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        
        //bucle mostrar tabla1:
        System.out.println("TABLA 1: ");
        for (int i=0; i<tabla1.length; i++) {
            for (int j=0; j<tabla1[i].length; j++)
                System.out.printf("%d ", tabla1[i][j]);
            System.out.println();
        }
        
        for (int i=0; i<tabla1.length; i++) {
            for (int j=0; j<i; j++) {
                int aux = tabla1[i][j];
                tabla1[i][j] = tabla1[j][i];
                tabla1[j][i] = aux;
            }
        }
        
        System.out.println("TABLA 1: ");
        for (int i=0; i<tabla1.length; i++) {
            for (int j=0; j<tabla1[i].length; j++)
                System.out.printf("%d ", tabla1[i][j]);
            System.out.println();
        }
    }
}
