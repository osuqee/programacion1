
// Cadena de caracteres, tienes una subcadena:
// Mostrar por pantalla numero de veces que la subcadena se encuentra
// dentro de la cadena.

// nnn como subcadena en 'nnnn' está 2 veces y en 'nnnnn' 3 veces.


package primera;

public class Ejercicio064 {
    public static void main(String arg[]) {
        char cad[] = {'E','n','n','n','n',' ','u','n','n','n','n','n',' ','l','u','g'};
        char subcad[] = {'n','n','n'};
        int cont=0;
        
        for (int i=0; i<cad.length-subcad.length+1; i++)
            if (cad[i] == subcad[0]) {
                int j=1;
                while ((j<subcad.length)&&(subcad[j] == cad[i+j]))
                    j++;
                if (j == subcad.length)
                    cont++;
            }
        
        System.out.printf("El numero de veces que la subcadena está es %d\n",cont);
    }
}
