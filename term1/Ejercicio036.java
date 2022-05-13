
//Listado de 10s.

package primera;

public class Ejercicio036 {
    public static void main(String arg[]) {
        int notas[][] = {{7,9,3,8},{10,9,9,8},{9,10,7,1},{3,10,5,6},{8,5,4,5}};//alumno, asignatura
        String alumnos[] = {"Javier M","Antonio M","José S","Juanan","Maria José"};
        String asignaturas[] = {"Programacion","Leng.Marcas","Sistemas","Bases de datos"};
        
        System.out.printf("Listado de DIECES :\n");
        
        for (int i=0; i<notas.length; i++) {
            for (int j=0; j<notas[i].length; j++) { 
                if (notas[i][j] == 10) {
                    System.out.printf("10 en %s de %s\n",asignaturas[j],alumnos[i]);
                }
            }
        }
    }
}
