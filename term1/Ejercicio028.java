
package primera;

public class Ejercicio028 {
    public static void main(String arg[]) {
        int tabla[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int v[] = {2,4,6};
        for (int i=0; i<tabla.length; i++) {
            for (int j=0; j<tabla[i].length; j++)
                System.out.printf("%d ",tabla[i][j]*v[i]);
            System.out.println();
        }
    }
}
