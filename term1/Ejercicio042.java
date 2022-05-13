
// Método de ordenación por burbuja.

package primera;

public class Ejercicio042 {
    public static void main(String arg[]) {
        int vector[] = {4,3,5,2,1};
        
        for (int i=0; i<vector.length; i++) {
            for (int j=vector.length-1; j>i; j--) {
                if (vector[j] < vector[j-1]) {
                    int aux = vector[j];
                    vector[j] = vector[j-1];
                    vector[j-1] = aux;
                }
            }
        }
        
        for (int i=0; i<vector.length; i++) {
            System.out.printf("%d ", vector[i]);
        }
    }
}
