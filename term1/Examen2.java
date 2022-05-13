
// Hacer el ejercicio anterior sobre Strings:
//  a. Sobre el mismo String
//  b. Sobre otro String

package primera;

public class Examen2 {
    public static void main (String arg[]) {
        //  a. Sobre el mismo String: 
        String cad = "eran las tres en la casa";
        int cambiar = cad.indexOf(" ");
        int inicio = 0;
        while (cambiar != -1) {
            if (cambiar-inicio > 3) {
                cad = cad.substring(0,inicio).concat(Character.toString(Character.toUpperCase(cad.charAt(inicio))).concat(cad.substring(inicio+1,cad.length())));
            }
            inicio = cambiar+1;
            cambiar = cad.indexOf(" ",cambiar+1);
        }
        cad = cad.substring(0,inicio).concat(Character.toString(Character.toUpperCase(cad.charAt(inicio))).concat(cad.substring(inicio+1,cad.length())));        
        System.out.println(cad);
        //  fin apartado a.
        
        
        //  b. Sobre otro String:
        cad = "eran las tres en la casa";
        String cad2 = "";
        cambiar = cad.indexOf(" ");
        inicio = 0;
        while (cambiar != -1) {
            if (cambiar-inicio > 3) {
                if (cad2.isEmpty())
                    cad2 = cad.substring(0,inicio).concat(Character.toString(Character.toUpperCase(cad.charAt(inicio))).concat(cad.substring(inicio+1,cad.length())));
                else 
                    cad2 = cad2.substring(0,inicio).concat(Character.toString(Character.toUpperCase(cad.charAt(inicio))).concat(cad.substring(inicio+1,cad.length())));
            }
            inicio = cambiar+1;
            cambiar = cad.indexOf(" ",cambiar+1);
        }
        if (cad2.isEmpty())
            cad2 = cad.substring(0,inicio).concat(Character.toString(Character.toUpperCase(cad.charAt(inicio))).concat(cad.substring(inicio+1,cad.length())));
        else 
            cad2 = cad2.substring(0,inicio).concat(Character.toString(Character.toUpperCase(cad.charAt(inicio))).concat(cad.substring(inicio+1,cad.length())));
        System.out.println(cad2);
        //  fin apartado b.
    }
}
