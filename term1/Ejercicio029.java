
package primera;

public class Ejercicio029 {
    public static void main(String arg[]) {
        int tabla[][] = {{10,20,-30,-40},{50,60,-70,80},{90,100,-110,120}};
        int v1[] = {0,0,0,0};
        int v2[] = {0,0,0};
        
        for (int i=0; i<tabla.length; i++) {
            for (int j=0; j<tabla[i].length; j++) {
                v1[j] += tabla[i][j];
                v2[i] += tabla[i][j];
            }
        }
        
        for (int i=0; i<v1.length; i++)
            System.out.printf("Suma columna %d es %d\n",i,v1[i]);
        for (int j=0; j<v2.length; j++)
            System.out.printf("Suma fila %d es %d\n",j,v2[j]);
    }
}
