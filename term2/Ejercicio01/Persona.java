package Ejercicio01;

public class Persona {
    private String nombre;
    public String apellidos;
    public double altura;
    public double peso;
    
    public Persona() {
        nombre = "Rodrigo";
        apellidos = "Diaz de Vivar";
        altura = 1.87;
        peso = 90;
    }
    
    public Persona(String nom, String ape) {
        this.nombre = nom;
        this.apellidos = ape;
        this.altura = 0.0;
        this.peso = 0.0;
    }
    
    public Persona(String nom, String ape, double altura, double pes) {
        this.nombre = nom;
        this.apellidos = ape;
        this.altura = altura;
        this.peso = pes;
    }
    
    public void mostrar(){
        // 'this' indica el objeto desde el que se llama a la función.
        System.out.println(this.nombre+" "+this.apellidos+" "+this.altura+" "+this.peso);
    }
}
