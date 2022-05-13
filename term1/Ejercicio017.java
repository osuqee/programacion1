
package primera;

public class Ejercicio017 {
    public static void main(String arg[]) {
        int v[] = {1,2,3,4,5,6,7};
        
        for (int a=0; a<(v.length/2); a++) {
            int temp = v[a];
            v[a] = v[v.length-1-a];
            v[v.length-1-a] = temp;
        }
        
        
        for (int a=0; a<v.length; a++)
            System.out.printf("v %d\n",v[a]);
    }
}
