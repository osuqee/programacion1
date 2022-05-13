
package primera;

public class Ejercicio063 {
    public static void main (String arg[]) {
        char frase[] = {'L','a',' ','c','a','s','a',' ','e','r','a',' ','b','l','a','n','c','a'};
        char sus = 'a';
        char susV[] = {'L','X','I'};
        char frase2[] = new char [100];
        
        for (int i=0; i<frase.length; i++) {
            frase2[i] = frase[i];
        }
        
        sustituir(frase2,sus,susV);
        
        for (int i=0; i<frase2.length; i++)
            System.out.printf("%c",frase2[i]);
        System.out.println();
    }
    public static void sustituir(char fM[], char sus, char susV[]) { // aqui declaras longitud, le pasas frase.length desde el main
        for (int i=0; i<fM.length; i++) { //aqui iría longitud
            if (fM[i] == sus) {
                for (int k=susV.length-1; k>0; k--) { // susV.length-1
                    for (int j=fM.length-1; j>i; j--) //aqui iría longitud
                        fM[j] = fM[j-1];
                    fM[i+1] = susV[k];
                }
                fM[i] = susV[0]; // Da igual ponerlo antes del for
                // Arregla el problema del caracter sustituto
                // en el vector para sustituir.
                i += susV.length;
            }
        }
    }
}

/*
// CODIGO DE AGUSTIN:
    for (int i=0; i<longitud; i++) {
        if (s1 == fr[i]) {
            fr[i] = s2[0];
            for (int x=1; x<s2.length; x++) {
                for (int j=longitud; j>i; j--)
                    fr[j] = fr[j-1];
                longitud++;
                fr[++i] = s2[x];
            }
        }
    }
*/
