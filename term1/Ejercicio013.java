
//División mediante restas:
package primera;

public class Ejercicio013 {
    public static void main(String arg[]) {
        int dividendo=7;
        int divisor=2;
        int cociente=0;
        while (dividendo>divisor) {
            dividendo-=divisor;
            cociente++;
        }
        dividendo+=divisor*cociente;
        System.out.printf("El cociente de dividir %d entre %d es: %d\n",dividendo,divisor,cociente);
    }
}
