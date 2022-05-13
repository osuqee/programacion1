
package primera;

public class Ejercicio019 {
    public static void main(String arg[]) {
        int v[] = {1,2,3,4,5};
        int media=0;
        
        for (int a=0; a<v.length; a++)
            media+=v[a];
        
        System.out.printf("La media del vector es: %d\n", media/v.length);
    }
}
