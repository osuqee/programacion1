
// quitar de un string los espacios en blanco.

package primera;

public class Ejercicio082 {
    public static void main(String arg[]) {
        String cad = "hola berenjena";
        
        int posicion = cad.indexOf(" ");
        while (posicion != -1) {
            cad  = cad.substring(0,posicion).concat(cad.substring(posicion+1));
            posicion = cad.indexOf(" ");
        }
        
        System.out.println(cad);
        // mi codigo:
        /*String cad2 = "";
        int pos = cad.indexOf(" ");
        cad2 = cad2.concat(cad.substring(0,cad.indexOf(" ")));
        
        while (cad.indexOf(" ",pos+1) != -1) {
            cad2 = cad2.concat(cad.substring(pos+1,cad.indexOf(" ",pos+1)));
            pos = cad.indexOf(" ",pos+1);
        }
        cad2 = cad2.concat(cad.substring(pos+1,cad.length()));

        System.out.println(cad2);*/
    }
}
