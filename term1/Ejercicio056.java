
// Funcion devuelve vector con numero de kilos vendidos de cada prod. 

package primera;

public class Ejercicio056 {
    public static void main(String arg[]) {
        int kilos[][] = {{5,6,9,23,7,14,0},{16,8,4,33,15,21,2}};
        String productos[] = {"Peras","Manzanas"};
        
        int sumaDeKilos[] = sumar(kilos);
        
        for (int i=0; i<sumaDeKilos.length; i++)
            System.out.printf("%s vendidos en kg: %d\n",productos[i],sumaDeKilos[i]); 
    }
    public static int[] sumar(int t[][]) {
        int suma[] = new int [t.length];
        for (int i=0; i<t.length; i++)
            for (int j=0; j<t[i].length; j++)
                suma[i] += t[i][j];
        return suma;
    }
}
