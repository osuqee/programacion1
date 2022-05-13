
package primera;

public class Ejercicio049 {
    public static void main(String arg[]) {
        int vector[] = {13,31,2,1,23,69,17};
        
        ordenar(vector);
        
        for (int i=0; i<vector.length; i++) {
            System.out.printf("%d ",vector[i]);
        }
    }
    public static void ordenar(int v[]) {
        for (int i=0; i<v.length; i++)
            for (int j=0; j<v.length-1; j++)
                if (v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
    }
}
