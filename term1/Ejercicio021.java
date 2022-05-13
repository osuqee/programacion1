
package primera;

public class Ejercicio021 {
    public static void main(String arg[]) {
        int v[] = {1,2,3,4,5};
        int aux = v[v.length-1];
        
        for (int a=v.length-1; a>0; a--)
            v[a] = v[a-1];
        v[0] = aux;
        
        for (int b=0; b<v.length; b++)
            System.out.printf("v %d\n",v[b]);
    }
}
