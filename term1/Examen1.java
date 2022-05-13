
// Cambiar a mayusculas la primera letra de cada palabra:
//  a. Sobre la propia cadena
//  b. Sobre una nueva cadena

package primera;

public class Examen1 {
    public static void main(String arg[]) {
        //  a. Sobre la propia cadena:
        char cad[] = {'e','r','a','n',' ','l','a','s',' ','t','r','e','s',' ','e','n',' ','l','a',' ','c','a','s','a'};
        int inicio = 0;
        for (int i=0; i<cad.length; i++)
            if (cad[i] == ' ' || i== cad.length-1) {
                if (i-inicio > 3)
                    if (inicio==0)
                        cad[0] = Character.toUpperCase(cad[0]);
                    else 
                        cad[inicio+1] = Character.toUpperCase(cad[inicio+1]);
                inicio = i;
            }
        System.out.println(cad);
        //  fin apartado a.
        
        
        //  b. Sobre una nueva cadena:
        /*char cad2[] = {'e','r','a','n',' ','l','a','s',' ','t','r','e','s',' ','e','n',' ','l','a',' ','c','a','s','a'};
        char cad3[] = new char [cad2.length];
        inicio = 0;
        for (int j=0; j<cad3.length; j++) {
            if (cad2[j] == ' ' || j == cad2.length-1) {
                if (j-inicio > 3)
                    if (inicio==0)
                        cad3[0] = Character.toUpperCase(cad2[0]);
                    else
                        cad3[inicio+1] = Character.toUpperCase(cad2[inicio+1]);
                inicio = j;
            }
            cad3[j] = cad2[j];
        }
        System.out.println(cad3);*/
        //  fin apartado b.
        
        //Solucion de Agustin: 
        solucion();
    }
    public static void solucion(){
        // algo asi tampoco ha probado
        char frase[] = {'e','n',' ','u','n',' ','l','u','g','a','r'};
        int inicio = 0, fin = 0;
        
        while (fin < frase.length) {
            while (frase[fin] != ' ')
                fin++;
            if ((fin-inicio) > 3)
                for (int i=inicio; i<fin; i++)
                    frase[i] = Character.toUpperCase(frase[i]);
                
            frase[inicio] = Character.toUpperCase(frase[inicio]);
            frase[fin-1] = Character.toUpperCase(frase[inicio-1]);
            
            inicio = ++fin;
        }
        System.out.println(frase);
    }
}
