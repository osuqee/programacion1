
// Tienes un numero en decimal y lo pasas a binario.

package primera;

public class Ejercicio095 {
    public static void main(String arg[]) {
        int num = 19;
        aBinario(num);
    }
    public static void aBinario(int n) {
        if (n/2 == 0)
            System.out.println(n%2);
        else {
            aBinario(n/2);
            System.out.println(n%2);
        }
    }
}
