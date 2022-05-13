
//Multiplicación mediante sumas.
package primera;

public class Ejercicio011 {
    public static void main(String arg[]) {
        int mult1=3;
        int mult2=7;
        int result=0;
        for(int cont=0;cont<mult2;cont++) {
            result+=mult1;
        }
        System.out.println("El resultado es: " + result);
    }
}
