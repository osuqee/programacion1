
// Modificar todo el contenido de una tabla multiplicando cada uno de ellos 
// por el multiplicador, se crea una funcion que lo haga.

package primera;

public class Ejercicio053 {
    public static void main(String arg[]) {
        int tabla[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int multiplicador = 4;
        
        modificar(tabla,multiplicador);
        
        for (int i=0; i<tabla.length; i++){
            System.out.printf("{ ");
            for (int j=0; j<tabla[i].length; j++)
                System.out.printf("%d ", tabla[i][j]);
            System.out.printf("}\n");
        }
    }
    public static void modificar(int t[][], int n) {
        for (int i=0; i<t.length; i++)
            for (int j=0; j<t[i].length; j++)
                t[i][j] *= n;
    }
}
