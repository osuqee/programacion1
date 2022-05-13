
package Ejercicio03;

public class EjecutableNif {
    public static void main(String arg[]) throws Exception{
        try {
            int a = 7/0;
        System.out.println("no llega");
        } catch (ArithmeticException ex) {
            System.out.println("Excepcion aritmetica generada");
        }
        System.out.println("continua la ejecucion");
        
        
        Nif d1;
        d1 = new Nif(12345678);
        d1.mostrar();
        
        Nif d;
        d = new Nif(3333333,'S');
    }
}
