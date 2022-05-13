
// Mostrar las ventas realizadas y calcularlas usando una función primero que 
// guarde por referencia en una tabla los resultados y después, con una función 
// que devuelva una tabla con los resultados.

package primera;

public class Ejercicio055 {
    public static void main(String arg[]) {
        int kilos[][] = {{5,6,9,23,7,14,0},{16,8,4,33,15,21,2}};
        double precios[] = {3.5,2.2};
        double ventas[][] = new double [kilos.length][kilos[0].length];
        
        calcular(kilos,precios,ventas);
        for (int i=0; i<ventas.length; i++){
            System.out.printf("{ ");
            for (int j=0; j<ventas[i].length; j++)
                System.out.printf("%.2f ", ventas[i][j]);
            System.out.printf("}\n");
        }
        
        System.out.println();
        double ventas2[][] = calcular2(kilos,precios);
        for (int i=0; i<ventas.length; i++){
            System.out.printf("{ ");
            for (int j=0; j<ventas2[i].length; j++)
                System.out.printf("%.2f ", ventas[i][j]);
            System.out.printf("}\n");
        }
    }
    //Función devuelve tabla:
    public static double[][] calcular2(int t1[][], double v[]) {
        double t2[][] = new double [t1.length][t1[0].length];
        for (int i=0; i<t1.length; i++)
            for (int j=0; j<t1[i].length; j++)
                t2[i][j]  = t1[i][j]*v[i];
        return t2;
    }
    //Función guarda en vector por referencia: 
    public static void calcular(int t1[][], double v[], double t2[][]){
        for (int i=0; i<t1.length; i++)
            for (int j=0; j<t1[i].length; j++)
                t2[i][j]  = t1[i][j]*v[i];
    }
}
