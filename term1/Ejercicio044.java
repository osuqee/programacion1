
package primera;

public class Ejercicio044 {
    public static void main(String arg[]) {
        int vector[] = {4,3,5,2,1};
        int aux;

        for (int x=1; x<vector.length; x++) {
            int i = x;
            while((i>0) && (vector[i] < vector[i-1])) {
                aux = vector[i];
                vector[i] = vector[i-1];
                vector[i-1] = aux;
                i--;
            }
        }
        
        /*for (int i=0; i<vector.length-1; i++) {
            int cont=i+1;
            while (cont > 0) {
                if (vector[cont] < vector[cont-1]) {
                    int aux = vector[cont];
                    vector[cont] = vector[cont-1];
                    vector[cont-1] = aux;
                }
                cont--;
            }
        }*/
        
        for (int i=0; i<vector.length; i++) {
            System.out.printf("%d ", vector[i]);
        }
    }
}
