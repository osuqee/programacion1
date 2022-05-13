
package primera;

public class Ejercicio072 {
    public static void main(String arg[]) {
        char cad[] = {'b','e','e','r','e','n','j','e','n','a',' ','p','i','e'};
        char elim = 'e';
        
        int j=0;
        
        while (j<cad.length)
            if (cad[j] == elim) {
                for (int k=j; k<cad.length-1; k++)
                    cad[k] = cad[k+1];
                cad[cad.length-1] = ' ';
            } else
                j++;
        
        System.out.println(cad);
    }
}
