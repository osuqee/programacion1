
package primera;

public class Ejercicio032 {
    public static void main(String arg[]) {
        int entradas[][] = {{2,2,30,4,5,10,7},{2,6,20,8,9,10,11},{1,10,11,12,13,14,15},{2,14,15,16,17,18,19}};
        String dias[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        int vacum[] = {0,0,0,0,0,0,0};
        int iMenor = 0;
        int iMayor = 0;
        
        for (int i=0; i<entradas.length; i++) {
            for (int j=0; j<entradas[i].length; j++)
                vacum[j] += entradas[i][j];
        }
        
        for (int i=0; i<vacum.length; i++) {
            if (vacum[i] < vacum[iMenor])
                iMenor = i;
            if (vacum[i] > vacum[iMayor]) 
                iMayor = i;
        }

        System.out.printf("El dia que menos entradas se vendieron fue %s y se vendieron %d\n",dias[iMenor],vacum[iMenor]);
        System.out.printf("El dia que mas entradas se vendieron fue %s y se vendieron %d\n",dias[iMayor],vacum[iMayor]);
    }
}
