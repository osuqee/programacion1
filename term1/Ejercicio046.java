
package primera;

public class Ejercicio046 {
    public static void main(String arg[]) {
        int v[] = {12,4,5,6,13,-3};
        int v2[] = {-12,-3,-2};
        System.out.printf("El elemento mayor del vector es %d\n",maximo(v));
        // Al llamar a la funcion 'maximo' como maximo(v) le estás mandando la 
        // direccion a partir de la cual está alojado el vector.
        System.out.printf("El elemento mayor del segundo vector es %d\n",maximo(v2));
    }
    public static int maximo(int vector[]) {
        int iMax = 0;
        for(int i=0; i<vector.length; i++)
            if (vector[i] > vector[iMax])
                iMax = i;
        return vector[iMax];
    }
}
