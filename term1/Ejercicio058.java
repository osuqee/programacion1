
package primera;

public class Ejercicio058 {
    public static void main(String arg[]) {
        char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',};
        
        System.out.printf("En la frase hay %d espacios en blanco\n",contar(frase));
        System.out.printf("El numero de palabras en la frase es %d\n",contar(frase)+1);
    }
    public static int contar(char v[]) {
        int cont = 0;
        for (int i=0; i<v.length; i++) {
            if (v[i] == ' ')
                cont++;
        }
        return cont;
    }
}
