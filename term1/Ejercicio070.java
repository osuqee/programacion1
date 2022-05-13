
// Sustituir subcad1 por subcad2 en cad2;

package primera;

public class Ejercicio070 {
    public static void main(String arg[]) {
        char cad[] = {'b','e','r','e','n','j','e','n','a'};
        char subcad1[] = {'e','n'}; // PATRON: 
        char subcad2[] = {'a','x','z'}; // SUSTITUTO: 
        
        // CODIGO PASANDO A OTRA VARIABLE:
        char cad2[] = new char [100];
        for (int i=0,j=0;i<cad.length;i++,j++) {
            if ((i<cad.length-1)&&(cad[i] == subcad1[0])) {
                int k = 1;
                while ((k<subcad1.length)&&(cad[i+k] == subcad1[k]))
                    k++;
                if (k == subcad1.length) {
                    for (int l=0; l<subcad2.length; l++)
                        cad2[j+l] = subcad2[l];
                    j += subcad2.length;
                    i += subcad1.length-1;
                } else
                    cad2[j] = cad[i];
            } else
                cad2[j] = cad[i];
        }
        System.out.println(cad2);
        
        // CODIGO SOBRE EL MISMO VECTOR:
        char cad3[] = new char [100];
        for (int i=0; i<cad.length; i++)
            cad3[i] = cad[i];
        
        for (int j=0; j<cad.length; j++) {
            if (cad3[j] == subcad1[0]) {
                int k = 1;
                while ((k<subcad1.length)&&(cad3[j+k] == subcad1[k]))
                    k++;
                if (k == subcad1.length) {
                    if (subcad2.length < subcad1.length) { // REDUCIR:
                        for (int l=0; l<subcad2.length; l++)
                            cad3[j+l] = subcad2[l];
                        j += subcad2.length;
                        for (int l=0; l<subcad1.length-subcad2.length; l++)
                            for (int m=j; m<cad3.length-1; m++) 
                                cad3[m] = cad3[m+1];
                    } else { // ALARGAR:
                        for (int l=subcad2.length-subcad1.length; l>0; l--)
                            for (int m=cad3.length-1; m>j+subcad1.length-1; m--) 
                                cad3[m] = cad3[m-1];
                        for (int l=subcad2.length-1; l>0; l--)
                            cad3[j+l] = subcad2[l];
                        cad3[j] = subcad2[0];
                        j += subcad2.length;
                    }
                }
            }
        }
        System.out.println(cad3);
    }
}
