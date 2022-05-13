
//Cálculo de variaciones matemáticas.
package primera;

public class Ejercicio012 {
    public static void main(String arg[]) {
        int x=7;
        int y=4;
        if (y > x) {
            int aux = x;
            x = y;
            y = aux;
        }
        int result=1;
        for(int b=x;b>y;b--) {
            result*=b;
        }
        System.out.println("Variaciones de " + x + " elementos tomados de " + y + " en " + y + " es: " + result);
        System.out.printf("Variaciones de %d elementos tomados de %d en %d es: %d\n",x,y,y,result);
    }
}
