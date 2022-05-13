
// Cambiar primera y ultima letra de cada palabra de una frase.
// Lo primero esta mal e inviertetodas las palabras cada una dentro
// de una frase.

package primera;

public class Ejercicio065 {
    public static void main(String arg[]) {
        // Solo funciona el programa si pones un espacio en blanco al final. 
        char cad[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' '};
        int anterior = 0;
        
        for (int i=0; i<cad.length; i++) {
            // Primera condicion while soluciona problema espacio en blanco 
            // necesario al final. 
            if ((i == cad.length-1) || (cad[i] == ' ')) {
                for (int j=0; j<(i-anterior)/2; j++) {
                    char aux = cad[anterior+j];
                    cad[anterior+j] = cad[i-j-1];
                    cad[i-j-1] = aux;
                }
                anterior = i+1;
            }
        }
        System.out.println(cad);
        

        // Codigo de Agustin: 
        /*char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' '};
        int inicio=0, fin=0;
        char intercambio;
        while (fin < frase.length) {
            while (frase[fin] != ' ')
                fin++;
            intercambio = frase[inicio];
            frase[inicio] = frase[fin-1];
            frase[fin-1] = intercambio;
            inicio = fin+1;
            fin++;
        }
        System.out.println(frase);*/
    }
}
