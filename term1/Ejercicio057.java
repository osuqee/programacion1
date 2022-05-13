
// Modifica contenido tabla kilos multiplicando los elementos que sean
// menores que 10 por el multiplicador.

package primera;

public class Ejercicio057 {
    public static void main(String arg[]) {
        int kilos[][] = {{5,6,9,23,7,14,0},{16,8,4,33,15,21,2}};
        int multiplicador = 5;
        
        modificar(kilos, multiplicador);
        
        for (int i=0; i<kilos.length; i++) {
            System.out.printf("{ ");
            for (int j=0; j<kilos[i].length; j++)
                System.out.printf("%d ",kilos[i][j]);
            System.out.printf("}\n");
        }
    }
    public static void modificar(int t[][], int mul) {
        for (int i=0; i<t.length; i++)
            for (int j=0; j<t[i].length; j++)
                if (t[i][j] < 10)
                    t[i][j] *= mul;
    }
}
