// realizado por Eduardo Losilla Forradellas a 9 de marzo de 2021
package Examen;

import java.awt.Choice;
import java.awt.Event;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;

public class Ejercicio3 extends Frame{
    TextArea textArea;
    
    public static void main(String arg[]) {
        Ejercicio3 app = new Ejercicio3();
    }
    public Ejercicio3() {
        super("2 Choices");
        
        String comunidades[] = {"Aragon","Extremadura","Murcia"};
        String provincias[][] = {{"Huesca","Teruel","Zaragoza"},{"Badajoz","Caceres"},{"Murcia"}};
        
        Panel principal = new Panel();
        principal.setLayout(new GridLayout(1,2));
        Panel paneles[][] = new Panel[1][2];
        for(int i = 0; i < paneles.length; i++)
            for (int j = 0; j < paneles[i].length; j++)
                paneles[i][j] = new Panel();
        
        Choice textArea = new Choice();
        textArea.setSize(100,100);
        paneles[0][1].add(textArea);
        principal.add(paneles[0][0]);
        
        MyChoice eleccion = new MyChoice(comunidades, textArea, provincias);
        paneles[0][0].add(eleccion);
        principal.add(paneles[0][1]);
        
        this.add(principal);
        
        this.pack();
        this.resize(300,300);
        this.show();
    }    
    public boolean handleEvent(Event ev) {
        if(ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        }
        return false;
    }
}
class MyChoice extends Choice {
    Choice texto;
    String options[][];
    public MyChoice(String v[], Choice txt, String options[][]){
        super();
        for (int i = 0; i < v.length; i++) {
            this.add(v[i]);
        }
        this.options = options;
        texto = txt;
    }
    
    public boolean action(Event ev, Object ob){
        switch (this.getSelectedItem()) {
            case "Aragon" :
                texto.removeAll();
                texto.add(options[0][0]);
                texto.add(options[0][1]);
                texto.add(options[0][2]);
                break;
            case "Extremadura" : 
                texto.removeAll();
                texto.add(options[1][0]);
                texto.add(options[1][1]);
                break;
            case "Murcia" : 
                texto.removeAll();
                texto.add(options[2][0]);
                break;
        }
        return true;
    }
}
