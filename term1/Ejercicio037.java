
// Mostrar nombre empleados que más y menos cobran y sus salarios medios mensuales.
// Mostrar el mes en que más y menos se cobra y cuales son sus salarios medios.

package primera;

public class Ejercicio037 {
    public static void main(String arg[]) {
        int salarios[][] = {{70,90,130,8,79,85},{100,95,108,107,120,110},{130,93,120,117,100,100},{150,195,188,197,220,210}};//alumno, asignatura
        String empleados[] = {"Javier M","Antonio M","José S","Juanan"};
        String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio"};
        
        double salMedios[] = {0,0,0,0}; //salariosAcum, int en el pc de agustin
        double mediasMes[] = {0,0,0,0,0,0};
        int iMenorEmp = 0;
        int iMayorEmp = 0;
        int iMenorMes = 0;
        int iMayorMes = 0;
        
        for (int i=0; i<salarios.length; i++)
            for (int j=0; j<salarios[i].length; j++) {
                salMedios[i] += salarios[i][j];
                mediasMes[j] += salarios[i][j];
            }
        for (int i=0; i<salMedios.length; i++) {
            if (salMedios[i] > iMayorEmp)
                iMayorEmp = i;
            if (salMedios[i] < iMenorEmp)
                iMenorEmp = i;
        }
        for (int i=0; i<mediasMes.length; i++) {
            if (mediasMes[i] > iMayorMes)
                iMayorMes = i;
            if (mediasMes[i] < iMenorMes)
                iMenorMes = i;
        }
        
        //System.out.println(iMayorEmp);
        System.out.printf("El empleado que más gana es %s con salario medio de %.2f\n",empleados[iMayorEmp],salMedios[iMayorEmp]/meses.length);
        System.out.printf("El empleado que menos gana es %s con salario medio de %.2f\n",empleados[iMenorEmp],salMedios[iMenorEmp]/meses.length);
        System.out.printf("El mes en el que más se gana es %s con media de %.2f\n",meses[iMayorMes],mediasMes[iMayorMes]/empleados.length);
        System.out.printf("El mes en el que menos se gana es %s con media de %.2f\n",meses[iMenorMes],mediasMes[iMenorMes]/empleados.length);
    }
}
