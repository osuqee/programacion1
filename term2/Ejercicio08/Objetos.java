package Ejercicio08;
import java.awt.*;

public class Objetos extends Frame{
    TextArea textArea;
    
    public static void main(String args[]){
        Objetos app = new Objetos();
    } 
    
    //constructor
    public Objetos(){
        super("Trabajando con Objetos de Java");
        setup();
        pack();
        resize(400,400);
        show();
    }
    
    public void setup(){
        Panel principal = new Panel();
        principal.setLayout(new GridLayout(3,3)); //9 celdas
        Panel paneles[][] = new Panel[3][3];
        for(int i = 0; i < paneles.length; i++)
            for (int j = 0; j < paneles[i].length; j++)
                paneles[i][j] = new Panel();
        
        //Veremos distintos tipos de inputs
        //Primera celda
        paneles[0][0].add(new Label("Campo de texto"));
        //paneles[0][0].add(new TextField("", 15)); //TextField para declarar un input
        //llamada a nuestra clase en vez de a la propia de java (TextField)
        paneles[0][0].add(new MiTextField("", 15));
        principal.add(paneles[0][0]);
        
        //Segunda celda
        textArea = new TextArea(5,10); //filas y columnas
        textArea.setBackground(Color.CYAN);
        paneles[0][1].add(textArea);
        principal.add(paneles[0][1]);
        
        //Tercera celda
        /*Choice eleccion = new Choice();//ahora llamada DropDownList
        eleccion.add("uwu");
        eleccion.add("uno");*/
        //llamada a nuestra clase en vez de a la propia de java (Choice)
        String opciones[] = {"Uwu","Si","No","xddddd"};
        MiChoice eleccion = new MiChoice(opciones, textArea);
        paneles[0][2].add(eleccion);
        principal.add(paneles[0][2]);
        
        //Cuarta celda
        //llamada a nuestra clase en vez de a la propia de java (List)
        String deportes[] = {"Atletismo", "Balonmano", "Tenis", "Esgrima", "Patinaje",
                             "Baloncesto"};
        MiLista lista = new MiLista(deportes, textArea);
        paneles[1][0].add(lista); //puedes pasarlo directamente sin darle nombre
        principal.add(paneles[1][0]);
        
        //Quinta celda
        paneles[1][1].add(new MiCanvas());
        principal.add(paneles[1][1]);
        
        this.add(principal);
    }
    
    public boolean handleEvent(Event ev){
        if(ev.id == Event.WINDOW_DESTROY){ 
            System.exit(0);
            return true;
        }
        else if(ev.id == Event.ACTION_EVENT){
            
        }
        return false;
    }
}
//nueva clase propia nuestra para mejorar TextField
class MiTextField extends TextField { //herencia TextField
    public MiTextField(String texto, int tamanyo){
        super(texto, tamanyo); //constructor de superclase
    }
    public boolean action(Event ev, Object ob){ //clase Object -> clase genérica
        //modificar texto a mayusculas y meter en el TextField
        this.setText(this.getText().toUpperCase()); 
        return true;
    }
}

//nueva clase propia nuestra para mejorar Choice
class MiChoice extends Choice {
    TextArea texto;
    public MiChoice(String v[], TextArea txt){
        super(); //constructor de superclase
        for (int i = 0; i < v.length; i++) {
            this.add(v[i]); //añadirlo a la lista
        }
        texto = txt;
    }
    
    public boolean action(Event ev, Object ob){
        texto.setText(this.getSelectedItem());
        return true;
    }
}

//nueva clase propia nuestra para mejorar List
class MiLista extends List{
    TextArea texto;
    public MiLista(String v[], TextArea txt){
        //primer parámetro elementos que muestra a la vista, el resto con scroll
        super(v.length-1, true); //constructor superclase
        for (int i = 0; i < v.length; i++) {
            this.add(v[i]);
        }
        texto = txt;
    }
    public boolean handleEvent(Event ev){
        if(ev.id == Event.ACTION_EVENT){
            texto.setText("Doble click");
            return true;
        }else if(ev.id == Event.LIST_SELECT){
            //texto.setText("Seleccion");
            String seleccionados[] = this.getSelectedItems();
            String textoAMostrar = "";
            for (int i = 0; i < seleccionados.length; i++) {
                textoAMostrar += seleccionados[i] + "\n";
            }
            texto.setText(textoAMostrar);
            return true;
        }else if(ev.id == Event.LIST_DESELECT){
            texto.setText("Deseleccion");
            return true;
        }else return false;
    }
}

class MiCanvas extends Canvas{
    int posX = 20;
    int posY = 20;
    public MiCanvas(){
        super(); 
        this.resize(75, 75); //anchura y altura canvas
        this.setBackground(Color.pink);
        this.setForeground(Color.MAGENTA);
        this.show();
    }
    
    public void paint(Graphics g){
        g.fillRect(posX, posY, 7, 7);
    }
    
    //para que no borre los cuadrados
    public void update(Graphics g){
        paint(g);
    }
    
    public boolean mouseDown(Event ev, int x, int y){ //posiciones del ratón
        posX = x;
        posY = y;
        this.repaint();
        return true;
    }
}