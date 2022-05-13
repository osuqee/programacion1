
package primera;

public class Ejercicio020 {
    public static void main(String arg[]) {
        int v[]={1,2,3,4};
        int aux = v[0];
        
        for (int a=1; a<v.length; a++)
             v[a-1] = v[a];
        v[v.length-1] = aux;
        
        for (int b=0; b<v.length; b++) 
            System.out.printf("v %d\n",v[b]);
    }
}
