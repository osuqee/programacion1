
package primera;

public class Ejercicio015 {
    public static void main(String arg[]) {
        int v[] = {1,34,4,-32,23,67,8};
        int max=v[0];
        for(int a=0;a<v.length;a++) {
            if (v[a] > max)
                max = v[a];
        }
        System.out.printf("El elemento mayor del vector es: %d\n",max);
        
        int indice=0;
        for(int a=0;a<v.length;a++) {
            if (v[a] > v[indice])
                indice = a;
        }
        System.out.printf("El índice del elemento es: %d\n",indice);
    }
}
