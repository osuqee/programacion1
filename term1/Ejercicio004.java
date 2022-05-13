
package primera;

public class Ejercicio004 {
    public static void main(String arg[]){
        int x = 7;
        int y = 4;
        int z = 8;
        if (x > y) {
            if (x > z)
                System.out.println("El mayor es: " + x);
            else
                System.out.println("El mayor es: " + z);
        }
        else {
            if (y > z)
                System.out.println("El mayor es: " + y);
            else
                System.out.println("El mayor es: " + z);
        }
    }
}
