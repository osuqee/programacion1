
package Ejercicio02;

public class Sobreanimales {
    public static void main(String arg[]) {
        Perro p1;
        Canguro c1;
        
        p1 = new Perro(1,"3 diciembre 2019","Jake",true,"Teckel",false);
        c1 = new Canguro(2,"4 agosto 2017","Ramón",true,70,45);
        
        p1.mostrar();
        c1.mostrar();
    }
}
