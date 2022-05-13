
// Devuelve numero campanadas de un reloj hasta la hora elegida.

package primera;

public class Ejercicio093 {
    public static void main (String arg[]) {
        int hora = 13;
        System.out.println("numero campanadas a las "+hora+": "+campanadas1(hora));
        int hora2 = 13;
        System.out.println("numero campanadas a las "+hora+": "+campanadas2(hora2));
    }
    public static int campanadas1(int n) {
        int suma = 0;
        for (int i=0; i<=n; i++)
            if (i<=12)
                suma += i;
            else
                suma += (i-12);
        return suma ;
    }
    public static int campanadas2(int n) {
        if (n == 1)
            return 1;
        else 
            if (n <= 12)
                return n + campanadas2(n-1);
            else 
                return n-12 + campanadas2(n-1);
    }
}
