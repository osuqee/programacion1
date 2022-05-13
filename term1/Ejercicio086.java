
// poner el caracter 'a' inmediatamente despues de cada palabra
// NO USAR replace()

package primera;

public class Ejercicio086 {
    public static void main(String arg[]) {
        String cad = "pepinos peras y melocotones ";
        
        for (int i=0; i<cad.length(); i++)
            if (cad.charAt(i) == ' ') {
                cad = cad.substring(0,i)+"a"+cad.substring(i,cad.length());
                i++;
            }
        
        // codigo de agustin:
        /*String cad2 = "pepinos peras y melocotones ";
        
        int posicion = cad2.indexOf(" ");
        while (posicion != -1) {
            cad2 = cad2.substring(0,posicion).concat("a").concat(cad2.substring(posicion));
            posicion = cad2.indexOf(" ",posicion+2);
        }
        System.out.println(cad2);
        */
        
        System.out.println(cad);
    }
}
