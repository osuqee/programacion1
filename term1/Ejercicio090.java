
// funcion realiza multiplicacion de dos numeros mediante sumas.

package primera;

public class Ejercicio090 {
    public static void main(String arg[]) {
        int a=5, b=4;
        
        System.out.println(a+" x "+b+" = "+multiplicar(a,b));
    }
    public static int multiplicar(int n1,int n2) {
        if (n2 == 0)
            return 0;
        else
            return n1 + multiplicar(n1,n2-1);
    }
}
