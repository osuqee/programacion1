
// Muestra el numero de entradas y cuales son la pelicula más taquillera 
// y la menos taquillera.

package primera;

public class Ejercicio033 {
    public static void main(String arg[]) {
        int entradas[][] = {{2,2,30,4,5,10,7},{2,6,20,8,9,10,11},{1,10,11,12,13,14,15},{2,14,15,16,17,18,19}};
        String peliculas[] = {"El resplandor","Spider-man","Torrente V", "Venom"};
        int vacum[] = {0,0,0,0};
        int iMayor = 0;
        int iMenor = 0;
        
        for (int i=0; i<entradas.length; i++) {
            for (int j=0; j<entradas[i].length; j++)
                vacum[i] += entradas[i][j];
        }
        
        for (int i=0; i<vacum.length; i++) {
            if (vacum[i] > vacum[iMayor])
                iMayor = i;
            if (vacum[i] < vacum[iMenor])
                iMenor = i;
        }
        
        System.out.printf("La pelicula menos taquillera fue %s con %d entradas vendidas\n", peliculas[iMenor],vacum[iMenor]);
        System.out.printf("La pelicula mas taquillera fue %s con %d entradas vendidas\n", peliculas[iMayor],vacum[iMayor]);
    }
}
