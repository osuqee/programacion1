
//Sacar por pantalla la pelicula y el dia que mas y menos vendieron.

package primera;

public class Ejercicio034 {
    public static void main(String arg[]) {
        int entradas[][] = {{2,2,30,4,5,10,7},{2,6,20,8,9,10,11},{1,10,11,12,13,14,15},{2,14,15,16,17,18,19}};
        String peliculas[] = {"El resplandor","Spider-man","Torrente V", "Venom"};
        String dias[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        int iMenor[] = {0,0}; //el primer indice indica el dia y 
        int iMayor[] = {0,0}; // el segundo la pelicula
        
        for (int i=0; i<entradas.length; i++) {
            for (int j=0; j<entradas[i].length; j++) {
                if (entradas[i][j] < entradas[iMenor[0]][iMenor[1]]) {
                    iMenor[0] = i;
                    iMenor[1] = j;
                }
                if (entradas[i][j] > entradas[iMayor[0]][iMayor[1]]) {
                    iMayor[0] = i;
                    iMayor[1] = j;
                }
            }
        }
        
        System.out.printf("El dia que menos entradas se vendieron fue el %s con la pelicula %s: %d\n",dias[iMenor[1]],peliculas[iMenor[0]],entradas[iMenor[0]][iMenor[1]]);
        System.out.printf("El dia que mas entradas se vendieron fue el %s con la pelicula %s: %d\n",dias[iMayor[1]],peliculas[iMayor[0]],entradas[iMayor[0]][iMayor[1]]);        
    }
}
