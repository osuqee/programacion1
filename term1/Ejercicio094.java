
// Diseccionar un numero en cifras.

package primera;

public class Ejercicio094 {
    public static void main(String arg[]) {
        String cifras[] = {"unidades","decenas","centenas","unidades de millar","decenas de millar","centenas de millar"};
        int num = 123456;
        
        int i=0;
        while (num > 0) {
            System.out.println((num%10) + " " + cifras[i]);
            i++;
            num /= 10;
        }
        num = 123456;
        
        diseccionar(num,0,cifras);
    }
    public static void diseccionar(int n, int cont, String v[]) {
        if (n/10 == 0) {
            System.out.printf("%d %s\n",n%10,v[cont]);
        } else {
            diseccionar(n/10,cont+1, v);
            System.out.printf("%d %s\n",n%10,v[cont]);
        }
    }
}
