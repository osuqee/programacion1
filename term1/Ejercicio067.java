
// Duplicar cad en cad2 una tras otra.

package primera;

public class Ejercicio067 {
    public static void main(String arg[]) {
        char cad[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' '};
        char cad2[] = new char [150];
        
        for (int i=0; i<2; i++)
            for (int j=0; j<cad.length; j++)
                cad2[i*cad.length+j] = cad[j];
        
        System.out.println(cad2);
    }
}
