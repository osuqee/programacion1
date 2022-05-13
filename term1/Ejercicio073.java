
package primera;
    
public class Ejercicio073 {
    public static void main(String arg[]) {
        char cad[] = {'b','e','r','e','n','j','e','n','a',' ','p','i','e'};
        char elim[] = {'e','n'};
        
        int i=0;
        while (i<cad.length)
            if (cad[i] == elim[0]) {
                int j=1;
                while ((j<elim.length) && (cad[i+j] == elim[j]))
                    j++;
                
                if (j == elim.length) {
                    for (int z=0; z<elim.length; z++) {
                        for (int k=i; k<cad.length-1; k++)
                            cad[k] = cad[k+1];
                        cad[cad.length-1] = ' ';
                    }
                } else
                    i++;
            } else
                i++;
        
        System.out.println(cad);
    }
}
