
// ordenar todos los vectores de salarios.
package primera;

public class Ejercicio050 {
    public static void main(String arg[]) {
        int salarios[][] = {{70,90,130,8,79,85},{100,95,108,107,120,110},{130,93,120,117,100,100},{150,195,188,197,220,210}};//alumno, asignatura
        
        for (int i=0; i<salarios.length; i++)
            ordenar(salarios[i]);
        
        for (int i=0; i<salarios.length; i++){
            System.out.printf("{ ");
            for (int j=0; j<salarios[i].length; j++)
                System.out.printf("%d ",salarios[i][j]);
            System.out.printf("}\n");
        }
    }
    public static void ordenar(int v[]) {
        for (int i=0; i<v.length; i++)
            for (int j=0; j<v.length-1; j++)
                if (v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
    }
}
