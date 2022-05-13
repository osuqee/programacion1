
// FACTORIAL:
// COMBINACIONES DE N ELEMENTOS TOMADOS DE M EN M: 

package primera;

public class Ejercicio051 {
    public static void main(String arg[]) {
        int num = 6;
        System.out.printf("El factorial de %d es %d\n",num,factorial(num));
        
        int n=3;
        int m=2;
        System.out.printf("Combinaciones de %d elementos tomados de %d en %d es %d\n",n,m,m,combinaciones(n,m));
    }
    
    public static int combinaciones(int n, int m) {
        return factorial(n)/(factorial(n-m)*factorial(m));
    }
    
    public static int factorial(int n) {
        int fac = 1;
        for (int i=n; i>0; i--)
            fac *= i;
        return fac;
    }
}
