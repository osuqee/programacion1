
// limpiar las frases para que quede entre ellas SOLO un espacio en blanco.
// hacerlo sin replaceAll.

package primera;

public class Ejercicio087 {
    public static void main(String arg[]) {
        String cad = "pepinos    peras  y melocotones";
        
        // la funcion replaceAll reemplaza en este caso todos los espacios
        // en blanco aunque sean muchos de vez y los sustituye por un espacio
        // en blanco solo.
        cad = cad.replaceAll(" +", " ");
        System.out.println(cad);
        
        // mi codigo
        String cad2 = "pepinos peras y melocotones ";
        int pos = cad2.indexOf(" ");
        while (pos != -1) {
            if (cad2.charAt(pos) == ' ')
                // String.substring(i1,i2) abarca desde la posición
                // i1 hasta la posición i2 SIN INCLUIR
                cad2 = cad2.substring(0,pos).concat(cad2.substring(pos,cad2.length()));
            pos = cad2.indexOf(" ",pos+1);
        }
        System.out.println(cad2);
        
        // codigo de Agustin:
        String cad3 = "pepinos peras y melocotones ";
        
        /*boolean primero = true;
        int i=0;
        while (i<cad.length()) {
            if (cad.charAt(i) == ' ')
                if (primero) {
                    primero = false;
                    i++;
                } else {
                    i
                }
        }
        System.out.println(cad3);*/
    }
}
