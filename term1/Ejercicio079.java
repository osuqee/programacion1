
package primera;

public class Ejercicio079 {
    public static void main(String arg[]) {
        String frase = "me gusta la berenjena";
        
        frase = frase.replace('e','x');
        System.out.println(frase);
        
        frase = frase.replace("gusta","encanta");
        System.out.println(frase);
        
        int index = frase.indexOf("encanta");
        System.out.println(index);
        
        int contador = 0;
        int posicion = frase.indexOf("encanta");
        while (posicion != -1) {
            contador++;
            posicion = frase.indexOf("encanta",posicion+1);
        }
        System.out.println(contador);
        
    }
}
