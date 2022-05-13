
package Ejercicio01;

public class Programa {
    public static void main(String arg[]) {
        Persona persona1, persona2, persona3;
        persona1 = new Persona();
        persona2 = new Persona("Antonio","Garcia");
        persona3 = new Persona("Antonio","Garcia",1.98,94);
        
        persona1 = persona2;
        
        persona1.mostrar();
        persona2.mostrar();
        persona3.mostrar();
    }
}
