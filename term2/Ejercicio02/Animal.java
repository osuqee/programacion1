
package Ejercicio02;

// Indica que no se puede crear directamente un objeto de esta clase
abstract class Animal {
    int id;
    String fNac;
    private String nombre;
    boolean vacunado;
    
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Animal(int id, String fNac, String nombre, boolean vacunado) {
        this.id = id;
        this.fNac = fNac;
        this.nombre = nombre;
        this.vacunado = vacunado;
    }
    
    // Las subclases de la clase Animal DEBERÁN TENER el metodo mostrar
    // esto se debe a ser declarado como ABSTRACT el metodo.
    abstract void mostrar();
}
