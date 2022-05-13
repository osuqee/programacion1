
package primera;

public class Ejercicio047 {
    public static void main(String arg[]) {
        int tabla[][] = {{1,1,1},{1,1,1},{1,1,1},{1,1,1}};
        System.out.printf("La suma de todos los elementos de la tabla es %d\n",suma(tabla));
    }
    
    public static int suma(int tabla[][]){
        int total = 0;
        for (int i=0; i<tabla.length; i++)
            for (int j=0; j<tabla[i].length; j++)
                total += tabla[i][j];
        return total;
    }
}
