
// funcion charAt de la clase String: 
//  devuelve el caracter en la posicion indicada del String. 

package primera;

public class Ejercicio076 {
    public static void main(String arg[]) {
        String frase = "me gusta la berenjena";
        char cad[] = new char [50];
        
        for (int i=0; i<frase.length(); i++) {
            cad[i] = frase.charAt(i);
        }
        
        System.out.println(cad);
    }
}
