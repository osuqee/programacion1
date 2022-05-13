
package primera;

public class Ejercicio025 {
    public static void main(String arg[]) {
        for (int i=1; i<10; i++) {
            System.out.printf("\nTABLA DEL: %d\n",i);
            for (int j=1; j<11; j++) {
                System.out.printf("%d x %d = %d\n",i,j,i*j);
            }
        }
    }
}
