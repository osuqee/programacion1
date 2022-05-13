
//Mostrar por pantalla si un numero es multiplo de otro
//o no lo es.
package primera;

public class Ejercicio007 {
    public static void main(String arg[]) {
        int x = 3;
        int y = 21;
        if (y < x) {
            int aux = x;
            x = y;
            y = aux;
        }
        if ((y%x) == 0)
            System.out.println(y + " es multiplo de " + x);
        else
            System.out.println(y + " no es multiplo de " + x);
    }
}
