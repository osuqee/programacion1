
// reemplazar la cadena por la misma cadena en mayusculas.

package primera;

public class Ejercicio081 {
    public static void main(String arg[]) {
        String frases[] = {"hola me","llamo oscar","me gustan los perros"};
        String subcad = "me";
        
        for (int j=0; j<frases.length; j++)
            frases[j] = frases[j].replace(subcad,subcad.toUpperCase());
        
        frases[0] = frases[0].concat(" ejem");
        
        for (int i=0; i<frases.length; i++)
            System.out.println(frases[i]);
    }
}
