
package primera;

public class Ejercicio078 {
    public static void main(String arg[]) {
        String frase = "me gusta la berenjena";
        int fin = 0;
        
        // Polimorfismo:
        //  la funcion String.substring tiene 2 formas:
        //  - la primera tiene un parametro y devuelve de ahi hasta el final
        //  - la segunda tiene 2 parametros y devuelve en ese rango
        
        System.out.println(frase.substring(fin));
        System.out.println(frase.substring(12,frase.length()));
    }
}
