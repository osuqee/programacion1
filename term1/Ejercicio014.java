
//Declaración y manipulación de vectores
package primera;

public class Ejercicio014 {
    public static void main(String arg[]) {
        int datos[] = {17,55,33,21,88};
        for (int i=0; i<datos.length; i++) {
            System.out.printf("datos[%d] = %d\n",i,datos[i]);
        }
        for (int j=0; j<datos.length; j++) {
            datos[j]*=2;
        }
        for (int i=0; i<datos.length; i++) {
            System.out.printf("datos[%d] = %d\n",i,datos[i]);
        }
    }
}
