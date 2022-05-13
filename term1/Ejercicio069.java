
package primera;

public class Ejercicio069 {
    public static void main(String arg[]) {
        char cad[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','a'};
        char cad2[] = new char [cad.length*2];
        
        for (int i=0; i<cad.length; i++) {
            cad2[i] = cad[i];
            cad2[cad2.length-1-i] = cad[i];
        }
        
        System.out.println(cad2);
    }
}
