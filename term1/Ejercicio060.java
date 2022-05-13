
// Modifica la cadena de caracteres pasando todos los caracteres 
// a mayusculas.

package primera;

public class Ejercicio060 {
    public static void main(String arg[]) {
        char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' '};
        
        aMayusculas(frase);
        
        for(int i=0; i<frase.length; i++)
            System.out.printf("%c",frase[i]);
        System.out.println();
    }
    public static void aMayusculas(char frase[]) {
        for (int i=0; i<frase.length; i++)
            frase[i] = Character.toUpperCase(frase[i]);
    }
}
