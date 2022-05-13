
//  Calcular máximo común divisor mediante el algoritmo de Euclides: 
//   ir restando el número más pequeño del más grande, hasta que queden iguales.
//   a. Hacerlo con un bucle.
//   b. Hacerlo con recursividad.

package primera;

public class Examen4 {
    public static void main(String arg[]) {
        int n1 = 2;
        int n2 = 6;
        int mcd = euclides(n1,n2);
        System.out.printf("El mcd de %d y %d es %d\n",n1,n2,mcd);
        
        //  a. Mediante un bucle:
        int aux1 = 17;
        int aux2 = 3;
        int n3 = aux1;
        int n4 = aux2;
        int mcd2 = 0;
        while (aux1 != aux2) {
            if (aux1 > aux2)
                aux1 -= aux2;
            else 
                aux2 -= aux1;
            mcd2 = aux2;
        }
        System.out.printf("El mcd de %d y %d es %d\n",n3,n4,mcd2);
    }
    //  b. Mediante una función con recursividad: 
    public static int euclides(int n1, int n2) {
        if (n1 == n2)
            return n2;
        else
            if (n1 > n2)
                return euclides(n1-n2,n2);
            else
                return euclides(n1,n2-n1);
    } 
}
