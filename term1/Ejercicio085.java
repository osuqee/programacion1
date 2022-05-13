
package primera;

public class Ejercicio085 {
    public static void main(String arg[]) {
        String cad = "hola me llamo berenjena";
        String cad2 = "";
        String cad3 = "";
        
        for (int i=cad.length(); i>0; i--) {
            cad2 = cad2.concat(Character.toString(cad.charAt(i-1)));
            cad3 += cad.charAt(i-1);
        }
        
        System.out.println(cad2);
        System.out.println(cad3);
    }
}
