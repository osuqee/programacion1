
// tras la ultima palabra hay un espacio en blanco
// poner la primera y ultima letra de cada palabra en mayuscula.

package primera;

public class Ejercicio074 {
    public static void main(String arg[]) {
        char cad[] = {'b','e','r','e','n','j','e','n','a',' ','p','i','e',' '};
        int anterior = 0;
        
        for (int i=0; i<cad.length; i++) {
            if (cad[i] == ' ') {
                cad[anterior] = Character.toUpperCase(cad[anterior]);
                cad[i-1] = Character.toUpperCase(cad[i-1]);
                anterior = i+1;
            }
        }
        
        //codigo de Agustin:
        char frase[] = {'b','e','r','e','n','j','e','n','a',' ','p','i','e',' '};
        int inicio=0,fin=0;
        while(fin < frase.length) {
            while (frase[fin] != ' ')
                fin++;
            frase[inicio] = Character.toUpperCase(frase[inicio]);
            frase[fin-1] = Character.toUpperCase(frase[fin-1]);
            inicio += ++fin;    
        }
        System.out.println(frase);
        
        System.out.println(cad);
    }
}
