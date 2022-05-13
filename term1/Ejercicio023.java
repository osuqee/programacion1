
package primera;

public class Ejercicio023 {
    public static void main(String arg[]) {
        int[] v = {10,20,30,40,50,60};
        System.out.printf("%d - %d - %d - %d  - %d - %d\n",v[0],v[1],v[2],v[3],v[4],v[5]);
        
        for (int i=0; i<v.length; i++) {
            int aux=v[v.length-1];
            for (int j=v.length-1; j>0; j--)
                v[j]=v[j-1];
            v[0]=aux;
            System.out.printf("%d - %d - %d - %d  - %d - %d\n",v[0],v[1],v[2],v[3],v[4],v[5]);
        }
    }   
}
