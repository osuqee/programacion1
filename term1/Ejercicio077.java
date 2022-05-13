
// ordenar vector de Strings.

package primera;

public class Ejercicio077 {
    public static void main(String arg[]) {
        String nombres[] = {"Jon","Marco","Mara","Carmel","J"};
        
        for (int i=0; i<nombres.length; i++)
            for (int k=nombres.length-1; k>i; k--)
                if (nombres[k].compareTo(nombres[k-1]) < 0) {
                    String aux = nombres[k];
                    nombres[k] = nombres[k-1];
                    nombres[k-1] = aux;
                }
        
        for (int j=0; j<nombres.length; j++)
            System.out.println(nombres[j]);
    }
}
