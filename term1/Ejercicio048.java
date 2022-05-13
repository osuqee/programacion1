
package primera;

public class Ejercicio048 {
    public static void main(String arg[]) {
        int salarios[][] = {{70,90,130,8,79,85},{100,95,108,107,120,110},{130,93,120,117,100,100},{150,195,188,197,220,210}};//alumno, asignatura
        String empleados[] = {"Javier M","Antonio M","José S","Juanan"};
        String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio"};
        
        // salariosSemestrales será una funcion que me devuelva lo que ha cobrado
        // cada empleado en los 6 meses.
        int empleadosAcum[] = salariosSemestrales(salarios);
        for (int i=0; i<empleadosAcum.length; i++)
            System.out.printf("%s ha cobrado %d\n",empleados[i],empleadosAcum[i]);
        System.out.println();
        
        int emplAcum[] = new int [salarios.length];
        salariosSemestrales2(salarios,emplAcum);
        for (int i=0; i<emplAcum.length; i++)
            System.out.printf("%s ha cobrado %d\n",empleados[i],emplAcum[i]);
        System.out.println();
        
        int mesesAcum[] = salariosMensuales(salarios);
        for (int i=0; i<mesesAcum.length; i++)
            System.out.printf("En %s se ha pagado %d\n",meses[i],mesesAcum[i]);
        System.out.println();
        
        int mesesAcum2[] = new int [salarios[0].length];
        salariosMensuales2(salarios,mesesAcum2);
        for (int i=0; i<mesesAcum2.length; i++)
            System.out.printf("En %s se ha pagado %d\n",meses[i],mesesAcum2[i]);
        System.out.println();
    }
    public static int[] salariosMensuales(int t[][]) {
        int v[] = new int [t[0].length];
        for (int i=0; i<t.length; i++)
            for (int j=0; j<t[i].length; j++)
                v[j] += t[i][j];
        return v;
    }
    public static void salariosMensuales2(int t[][], int v[]) {
        for (int i=0; i<t.length; i++)
            for (int j=0; j<t[0].length; j++)
                v[j] += t[i][j];
    }
    public static int[] salariosSemestrales(int t[][]) {
        int v2[] = new int [t.length];
        for (int i=0; i<t.length; i++)
            for (int j=0; j<t[i].length; j++)
                v2[i] += t[i][j];
        return v2;
    }
    public static void salariosSemestrales2(int t[][], int v[]) {
        for (int i=0; i<t.length; i++)
            for (int j=0; j<t[i].length; j++)
                v[i] += t[i][j];
    }
}
