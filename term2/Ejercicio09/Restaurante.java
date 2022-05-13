
package Ejercicio09;
import java.awt.*;

public class Restaurante extends Frame{
    String comidas[] = {"Desayuno","Comida","Cena"};
    String platos[][] = {{"Colacao","Nesquick","Croissant","Napolitana","Cafe","Fruta"},{"Paella","Pure","Croquetas","Pasta","Salmon","Ventresca de atun","Fideua"},{"Huevos rotos","Tortilla de patata","Tortilla al gusto","Hamburguesa","Hamburguesa especial","Sopa","Ensalada","Fruta"}};
    Choice chComidas;
    List[] listasPlatos;
    List presentar;
    TextField texto;
    
    public static void main(String arg[]) {
        Restaurante app = new Restaurante();
    }
    
    public Restaurante() {
        super("Restaurante Aplicacion");
        setup();
        pack();
        resize(275,175);
        show();
    }
    
    public void setup() {
        this.add("North", new Label("Elige la comanda",Label.CENTER));
        chComidas = new Choice();
        for (int i=0; i<comidas.length; i++)
            chComidas.add(comidas[i]);
        
        listasPlatos = new List[comidas.length];
        for (int i=0; i<platos.length; i++) {
            listasPlatos[i] = new List(5,true);
            for (int j=0; j<platos[i].length; j++)
                listasPlatos[i].add(platos[i][j]);
        }
        
        presentar = listasPlatos[0];
        
        texto = new TextField("",40);
        
        
        
        this.add("West",chComidas);
        this.add("East",presentar);
        this.add("South",texto);
    }
    
    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof Choice) {
                this.remove(presentar);
                presentar = listasPlatos[chComidas.getSelectedIndex()];
                this.add("East", presentar);
                this.show();
                texto.setText(chComidas.getSelectedItem() + " : ");
                return true;
            } 
        } else if ((ev.id == Event.LIST_SELECT) || (ev.id == Event.LIST_DESELECT)) {
            String peticion = chComidas.getSelectedItem() + " : ";
            String seleccionados[] = presentar.getSelectedItems();
            for (int i=0; i<seleccionados.length; i++)
                peticion += seleccionados[i] + ", ";
            peticion = peticion.substring(0,peticion.length()-2);
            texto.setText(peticion);
            return true;
        }
        return false;
    }
}
