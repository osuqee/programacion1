
// Añadir al final de cada palabra una 'x' 

package primera;

public class Ejercicio059 {
    public static void main(String arg[]) {
        char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' '};
        char fraseMod[] = new char[50];
        
        modificar1(frase,fraseMod);
        for (int i=0; i<fraseMod.length;i++)
            System.out.printf("%c",fraseMod[i]);
        System.out.println();
        
        char fraseMod2[] = modificar2(frase);
        for (int i=0; i<fraseMod.length;i++)
            System.out.printf("%c",fraseMod[i]);
        System.out.println();
        
        char fraseMod3[] = new char[50];
        System.out.println("Esta es con el codigo de clase");
        modificar3(frase,fraseMod3);
        for (int i=0; i<fraseMod.length;i++)
            System.out.printf("%c",fraseMod[i]);
        System.out.println();
    }
    public static char[] modificar2(char f[]) {
        char fMod[] = new char[50];
        for (int i=0, cont=0; i<f.length; i++) {
            fMod[i+cont] = f[i];
            if (f[i] == ' ') {
                fMod[i+cont] = 'x';
                cont++;
            }
            fMod[i+cont] = f[i];
        }
        return fMod;
    }
    public static void modificar1(char f[], char fMod[]) {
        for (int i=0,cont=0; i<f.length; i++) {
            if (f[i] == ' ') {
                fMod[i+cont] = 'x';
                cont++;
            }
            fMod[i+cont] = f[i];
        }
    }
    // ESTA ES UNA DE LAS FUNCIONES QUE HIZO EN CLASE:
    //  crea un indice aparte que lleva la posicion dentro de la modificada
    public static void modificar3(char f1[], char f2[]) {
        for (int i=0,j=0; i<f1.length; i++) {
            if (f1[i] == ' ') {
                f2[j] = 'x';
                j++;
            }
            f2[j] = f1[i];
        }
    }
}
