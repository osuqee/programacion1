
package Ejercicio02;

public class Canguro extends Animal{
    int salto;
    int velocidad;
    
    public Canguro(int id, String fNac, String nombre, boolean vacunado, int salto, int velocidad) {
        super(id,fNac,nombre,vacunado);
        this.salto = salto;
        this.velocidad = velocidad;
    }
    
    public void mostrar() {
        System.out.printf("Hola soy %s y salto %d\n",this.getNombre(),this.salto);
    }
}
