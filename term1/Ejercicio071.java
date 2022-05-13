
// tiene que haber un espacio delante de la cadena

package primera;

public class Ejercicio071 {
    public static void main(String arg[]) {
        char cad[] = {' ','e','n',' ','m','i',' ','c','a','s','a'};
        char cad2[] = new char [cad.length];
        int anterior = cad.length-1;
        
        for (int i=cad.length-1,j=0; i>=0; i--)
            if (cad[i] == ' ') {
                for (int k=i; k<=anterior; k++, j++)
                    cad2[j] = cad[k];
                anterior = i-1;
            }
        
        System.out.println(cad2);
    }
}
