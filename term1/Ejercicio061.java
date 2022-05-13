
// Sustituye el caracter c1 en la frase si este aparece por s2.

package primera;

public class Ejercicio061 {
    public static void main(String arg[]) {
        char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' '};
        
        char aSustituir = 'a';
        char sustituto = 'X';
        
        sustitucion(frase,aSustituir,sustituto);
        
        for (int i=0; i<frase.length; i++)
            System.out.printf("%c",frase[i]);
        System.out.println();
    } 
    public static void sustitucion(char f[], char c1, char sus) {
        for (int i=0; i<f.length; i++)
            if (f[i] == c1)
                f[i] = sus;
    }
}
