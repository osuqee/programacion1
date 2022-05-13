
package primera;

public class Ejercicio080 {
    public static void main(String arg[]) {
        String frases[] = {"hola me","llamo oscar"};
        
        int cont = 0;
        
        //manera 1
        for (int j=0; j<frases.length; j++)
            for (int i=0; i<frases[j].length(); i++)
                if (frases[j].charAt(i) == 'a')
                    cont++;
        System.out.printf("el numero de veces que sale es %d\n",cont);
        
        //manera 2
        cont = 0;
        int pos = -1;
        for (int i=0; i<frases.length; i++) {
            pos = frases[i].indexOf("a");
            while (pos != -1) {
                cont++;
                pos = frases[i].indexOf("a",pos+1);
            }
        }
        System.out.printf("el numero de veces que sale es %d\n",cont);
        
        //manera 3
        cont = 0;
        for (int i=0; i<frases.length; i++)
            for (int j=0; j<frases[i].length(); j++)
                if (frases[i].substring(j,j+1).compareTo("a") == 0)
                    cont++;
        System.out.printf("el numero de veces que sale es %d\n",cont);
    }
}
