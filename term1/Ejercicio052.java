
// Cada empleado, su nombre y cuanto ha ganado en 6 meses
// Crear una funcion que devuelva el salario (la suma) de un empleado. 

package primera;

public class Ejercicio052 {
    public static void main(String arg[]) {
        int salarios[][] = {{70,90,130,8,79,85},{100,95,108,107,120,110},{130,93,120,117,100,100},{150,195,188,197,220,210}};//alumno, asignatura
        String empleados[] = {"Javier M","Antonio M","José S","Juanan"};
        
        for (int i=0; i<salarios.length; i++)
            System.out.printf("%s tuvo un salario de %d\n", empleados[i],suma(salarios[i]));
    }
    
    public static int suma(int v[]) {
        int acum = 0;
        for (int i=0; i<v.length; i++)
            acum += v[i];
        return acum;
    }
}
