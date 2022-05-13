
package primera;

public class Ejercicio031 {
    public static void main(String arg[]) {
        int kilos[][] = {{10,20,30,40,25},{50,60,70,80,27},{90,100,110,120,50}};
        String productos[] = {"Naranjas","Peras","Melones"};
        double precios[] = {1.5, 2.08, 0.8};
        double acum;
        double total = 0;
        
        for (int i=0; i<kilos.length; i++) {
            acum = 0;
            for (int j=0; j<kilos[i].length; j++)
                acum += kilos[i][j]*precios[i];
            System.out.printf("Vendidos %.2f euros de %s\n", acum, productos[i]);
            // %.2f indica que muestre solo 2 decimales.
            total += acum;
        }
        
        System.out.printf("En total se han vendido %.2f euros de fruta.\n", total);
    }
}
