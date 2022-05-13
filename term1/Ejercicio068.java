
package primera;

public class Ejercicio068 {
    public static void main(String arg[]) {
        char cad[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','a'};
        char cad2[] = new char [cad.length];
        
        for (int i=0; i<cad.length/2+1; i++) {
            cad2[i] = cad[cad.length-1-i];
            cad2[cad.length-1-i] = cad[i];
        }
        
        System.out.println(cad2);
    }
}
