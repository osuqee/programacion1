
// convertir vocales en minusc. a mayusc.
// y vocales en mayusc a minusc. 
// el resto de caracteres sustituir por una @.

package primera;

public class Ejercicio075 {
    public static void main(String arg[]) {
        char cad[] = {'H','O','L','a',' ','m','u','N','d','o'};
        
        for (int i=0; i<cad.length; i++)
            switch(cad[i]) {
                case 'a': case 'e': case 'i': case 'o': case 'u': 
                    cad[i] = Character.toUpperCase(cad[i]);
                    break;
                case 'A': case 'E': case 'I': case 'O': case 'U': 
                    cad[i] = Character.toLowerCase(cad[i]);
                    break;
                default:
                    cad[i] = '$';
            }
        
        System.out.println(cad);
    }
}
