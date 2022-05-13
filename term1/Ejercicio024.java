
package primera;

public class Ejercicio024 {
    public static void main(String arg[]) {
        int v[]={10,20,30,40,50,60};
        int multiplos[]={3,5,7};
        
        for (int i=0; i<multiplos.length; i++) {
            for (int j=0; j<v.length; j++)
                System.out.printf("%d - ",v[j]*multiplos[i]);
            System.out.println();
        }
    }
}
