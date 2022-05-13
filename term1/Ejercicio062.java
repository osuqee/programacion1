
// Modificar la frase para que cada vez que aparezca el elemento "sus"
//  escriba en vez de el, todos los elementos del vector "susV".    

package primera;

public class Ejercicio062 {
    public static void main(String arg[]) {
        char frase[] = {'L','a',' ','c','a','s','a',' ','e','r','a',' ','b','l','a','n','c','a'};
        char sus = 'a';
        char susV[] = {'X','I'};
        
        char f2[] = new char [100];
        
        sustituir(frase,sus,susV,f2);
        
        for (int i=0; i<f2.length; i++)
            System.out.printf("%c",f2[i]);
        System.out.println();
    }
    public static void sustituir(char f[], char sus, char susV[], char fM[]) {
        for (int i=0,j=0; i<f.length; i++,j++) {
            if (f[i] == sus)
                for (int k=0; k<susV.length; k++,j++) {
                    fM[j] = susV[k];
                }
            else
                fM[j] = f[i];
        }
    }
}
