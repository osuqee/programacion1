
package Ejercicio02;

public class Perro extends Animal{
    String raza;
    boolean peligrosidad;
    
    public String getRaza() {
        return this.raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public Perro(int id, String fNac, String nombre, boolean vacunado, String raza, boolean peligrosidad) {
        // llamada al metodo constructor de la superclase
        super(id,fNac,nombre,vacunado);
        this.raza = raza;
        this.peligrosidad = peligrosidad;
    }
    
    public void mostrar() {
        System.out.printf("Hola soy %s y soy de raza %s\n",this.getNombre(),this.raza);
    }
}
