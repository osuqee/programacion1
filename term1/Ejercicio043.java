
// Método ordenación directa de un vector.

package primera;

public class Ejercicio043 {
    public static void main(String arg[]) {
        int vector[] = {4,3,5,2,1};
        
        for(int j=0; j<vector.length; j++) {
            int iMenor = j;
            for (int i=j; i<vector.length; i++) {
                if (vector[i] < vector[iMenor])
                    iMenor = i;
            }
            int aux = vector[j];
            vector[j] = vector[iMenor];
            vector[iMenor] = aux;
        }
        
        
        for (int i=0; i<vector.length; i++) {
            System.out.printf("%d ", vector[i]);
        }
    }
}
