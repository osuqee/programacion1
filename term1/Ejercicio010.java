
package primera;

public class Ejercicio010 {
    public static void main(String arg[]) {
        int numero = 16;
        int factorial=1;
        //Bucle ascendente para factorial
        for(int a=1;a<=numero;a++) {
            factorial*=a;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
        //factorial=1; //descomentar para ver ambos resultados.
        //Bucle descendente para factorial
        for(int a=numero;a>1;a--) {
            factorial*=a;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
