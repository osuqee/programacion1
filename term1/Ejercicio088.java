
package primera;

public class Ejercicio088 {
    public static void main(String arg[]) {
        String cad1 = "pepinos peras y melocotones ";
        String cad2 = "";
        String cad3 = "";
        
        boolean turno = true;
        int anterior = 0;
        int pos = cad1.indexOf(" ");
        
        while (pos != -1) {
            if (turno) {
                cad2 = cad2.concat(cad1.substring(anterior,pos+1));
                turno = false;
            }
            else { 
                cad3 = cad3.concat(cad1.substring(anterior,pos+1));
                turno = true;
            }
            anterior = pos+1;
            pos = cad1.indexOf(" ",pos+1);
        }
        
        System.out.println(cad2);
        System.out.println(cad3);
    }
}
