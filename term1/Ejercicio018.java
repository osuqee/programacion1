
package primera;


public class Ejercicio018 {
    public static void main(String arg[]) {
        int v[] = {1,-2,-3,4,7};
        
        for (int a=0; a<v.length; a++) {
            if (v[a]>0)
                v[a]*=2;
            else
                v[a]*=-1;
        }
        
        for (int b=0; b<v.length; b++) {
            System.out.printf("v %d\n",v[b]);
        }
    }
}
