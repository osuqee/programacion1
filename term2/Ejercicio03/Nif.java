
package Ejercicio03;

public class Nif {
    public int dni;
    public char letra;
    // 'static' sirve para declarar constantes.
    public static char tabla[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    
    public Nif(int dni, char letra) throws Exception{
        this.dni = dni;
        if (letra != tabla[dni%23])
            throw new Exception("me ha pasado mal el nif");
        this.letra = tabla[dni%23];
    }
    public Nif(int dni) throws Exception{
        this(dni,tabla[dni%23]);
    }
    
    public void mostrar() {
        System.out.println(this.dni + " - " + this.letra);
    }
}
