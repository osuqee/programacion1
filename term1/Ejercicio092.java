
// Division entera mediante restas.

package primera;

public class Ejercicio092 {
    public static void main(String arg[]) {
        int a=17, b=3;
        
        System.out.println(a+" : "+b+" = "+dividir(a,b));
    }
    public static int dividir(int a, int b) {
        if (a < b)
            return 0;
        else
            return 1 + dividir(a-b,b);
    }
}
