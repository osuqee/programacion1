
package primera;

public class Ejercicio016 {
    public static void main(String arg[]) {
        int v[]={-5,4,-23,17,2,6};
        int iMenor=0;
        int iMayor=0;
        for (int a=0; a<v.length; a++) {
            if (v[a] > v[iMayor])
                iMayor=a;
            if (v[a] < v[iMenor])
                iMenor=a;
        }
        System.out.printf("El elemento menor es %d en la posición %d\n",v[iMenor],iMenor);
        System.out.printf("El elemento mayor es %d en la posición %d\n",v[iMayor],iMayor);
    }
}
