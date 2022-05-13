
// Multiplicación de una matriz y un vector y devolver resultado 
//  en otra matriz, realizar con función y escribir al final por pantalla.

package primera;

public class Examen3 {
    public static void main(String arg[]) {
        int m[][] = {{1,1,1,1},{1,1,1,2},{1,1,1,3},{1,1,1,4}};
        int v[] = {2,2,2,2};
        int result[] = new int [m.length];
        
        result = multiplicar(m,v);
        
        for(int i=0; i<result.length; i++) {
            System.out.println("("+result[i]+")");
        }
    }
    public static int[]multiplicar(int m1[][], int v1[]) {
        int result[] = new int [m1.length];
        for (int i=0; i<m1.length; i++) {
            result[i] = 0;
            for (int j=0; j<m1[i].length; j++)
                result[i] += m1[i][j]*v1[j];
        }
        return result;
    }
}
