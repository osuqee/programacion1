
// Funciones:

package primera;

public class Ejercicio045 {
    public static void main(String arg[]) {
        String palabra;
        escribir();
        hablar("Buenos dias");
        animalHabla("Me llamo Toby","Guau, guau");
        String palabras = concatenar("En un lugar"," de la mancha");
        System.out.println(palabras);
        System.out.printf("La suma de 345 + 55 es %d\n",suma(345,55));
    }
    public static void escribir() {
        System.out.println("Hola");
    }
    public static void hablar(String frase) {
        System.out.println(frase);
    }
    public static void animalHabla(String frase, String onomatopeya) {
        System.out.println(frase + " : " + onomatopeya);
    }
    public static String concatenar(String frase1, String frase2) {
        return frase1+frase2;
    }
    public static int suma(int a, int b) {
		return a + b;
    }
}
