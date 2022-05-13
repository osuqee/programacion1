
// Alumno con mejores y peores notas y cuales son sus medias.
// también mostrar por pantalla la asignatura con mejores y peores notas y sus medias.

package primera;

public class Ejercicio035 {
    public static void main(String arg[]) {
        int notas[][] = {{7,9,3,8},{10,9,9,8},{9,10,7,1},{3,10,5,6},{8,5,4,5}};//alumno, asignatura
        String alumnos[] = {"Javier M","Antonio M","José S","Juanan","Maria José"};
        String asignaturas[] = {"Programacion","Leng.Marcas","Sistemas","Bases de datos"};
        
        double medias[] = {0,0,0,0,0};
        int iMayor = 0;
        int iMenor = 0;
        double mediasAsig[] = {0,0,0,0};
        int iAsigMayor = 0;
        int iAsigMenor = 0;
        
        for (int i=0; i<notas.length; i++)
            for (int j=0; j<notas[i].length; j++) {
                medias[i] += notas[i][j];
                mediasAsig[j] += notas[i][j];
            }
        for (int i=0; i<medias.length; i++)
            medias[i] /= 4;
        for (int i=0; i<medias.length; i++) {
            if (medias[i] > medias[iMayor])
                iMayor = i;
            if (medias[i] < medias[iMenor])
                iMenor = i;
        }
             
        for (int i=0; i<mediasAsig.length; i++) {
            if (mediasAsig[i] > mediasAsig[iAsigMayor])
                iAsigMayor = i;
            if (mediasAsig[i] < mediasAsig[iAsigMenor])
                iAsigMenor = i;
        }
        for (int i=0; i<mediasAsig.length; i++) 
            mediasAsig[i] /= 5;
        
        System.out.printf("El alumno con la media más alta es %s con %.2f de media\n",alumnos[iMayor],medias[iMayor]);
        System.out.printf("El alumno con la media más baja es %s con %.2f de media\n",alumnos[iMenor],medias[iMenor]);
        System.out.printf("La asignatura con mejor media es %s con media de %.2f\n",asignaturas[iAsigMayor],mediasAsig[iAsigMayor]);
        System.out.printf("La asignatura con mejor media es %s con media de %.2f\n",asignaturas[iAsigMenor],mediasAsig[iAsigMenor]);
    }
}
