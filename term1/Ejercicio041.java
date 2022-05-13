/*
Media de goles por temporada de cada futbolista. Sin vector auxiliar.
*/
package primera;


public class Ejercicio041 {
    public static void main(String arg[]){
        int goles[][] = {{18, 19, 22, 33, 20}, {22, 26, 27, 18, 16}, {19, 10, 21, 32, 17}, {23, 17, 10, 33, 25}};
        String futbolistas[] = {"Messi", "Ronaldo", "Suárez", "Grizman", "Neymar"};
        int gol;
        double media = goles.length; 
        
        for(int j = 0; j < futbolistas.length; j++){ //marca las columnas para poder sacar futbolistas
            gol = 0;
            for(int i = 0; i < goles.length; i++){ //marca las filas
                gol += goles[i][j]; //acumula goles de cada columna
            }
            System.out.printf("La media de goles de %s es de %.1f \n", futbolistas[j], gol/media);
        }
    }
}