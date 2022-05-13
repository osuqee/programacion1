
package primera;

public class Ejercicio066 {
    public static void main(String arg[]) {
        char cad[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' '};

        rotarDerecha(cad);
        System.out.println(cad);
        
        rotarIzquierda(cad);
        System.out.println(cad);
    }
    public static void rotarDerecha(char cad[]) {
        int anterior = 0;
        for (int i=0; i<cad.length; i++)
            if ((i == cad.length-1) || (cad[i] == ' ')) {
                char aux = cad[i-1];
                for (int k=i-1; k>anterior; k--)
                    cad[k] = cad[k-1];
                cad[anterior] = aux;
                anterior = i+1;
            }
    }
    public static void rotarIzquierda(char cad[]) {
        int anterior = 0;
        for (int i=0; i<cad.length; i++)
            if ((i == cad.length-1) || (cad[i] == ' ')) {
                char aux = cad[anterior];
                for (int k=anterior; k<i-1; k++)
                    cad[k] = cad[k+1];
                cad[i-1] = aux;
                anterior = i+1;
            }
    }
}
