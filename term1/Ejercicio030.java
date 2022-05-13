
package primera;

public class Ejercicio030 {
    public static void main(String arg[]) {
        int tabla[][] = {{10,20,30,40,25},{50,60,70,80,27},{90,100,110,120,50}};
        String productos[] = {"Naranjas","Peras","Melones"};
        int suma[] = {0,0,0};
        int acum = 0;
        
        for (int i=0; i<tabla.length; i++) {
            for (int j=0; j<tabla[i].length; j++)
                suma[i] += tabla[i][j];
            System.out.printf("%s hay %d kg\n",productos[i],suma[i]);
        }
        
        System.out.println();
        System.out.println();
        
        for (int i=0; i<tabla.length; i++) {
            for (int j=0; j<tabla[i].length; j++)
                acum += tabla[i][j];
            System.out.printf("%s hay %d kg\n",productos[i],acum);
            acum = 0;
        }
    }
}
