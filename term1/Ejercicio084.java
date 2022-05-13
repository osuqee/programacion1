
package primera;

public class Ejercicio084 {
    public static void main(String arg[]) {
        String cad = "hola llamo que ";
        String cad2 = "me berenjena tal estas amigo ";
        String cad3 = "";
        int ind1 = 0;
        int ind2 = 0;       
        int pos1 = cad.indexOf(" ");
        int pos2 = cad2.indexOf(" ");
        
        while (pos1!=-1 && pos2!=-1) {
            cad3 = cad3.concat(cad.substring(ind1,pos1+1));
            cad3 = cad3.concat(cad2.substring(ind2,pos2+1));
            ind1 = pos1+1;
            ind2 = pos2+1;
            pos1 = cad.indexOf(" ",pos1+1);
            pos2 = cad2.indexOf(" ",pos2+1);
        }
        
        if (pos1 != -1) {
            cad3 = cad3.concat(cad.substring(ind1,cad.length()));
        } else if (pos2 != -1) {
            cad3 = cad3.concat(cad2.substring(ind2,cad2.length()));
        }
        
        System.out.println(cad3);
    }
}
