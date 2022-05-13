
package Ejercicio07;
import java.awt.*;

public class FrameApp extends Frame {
    MenuBar porDefecto;
    MenuBar alternativo;
    String tituloInicial;
    int cursores[] = {CROSSHAIR_CURSOR, DEFAULT_CURSOR, E_RESIZE_CURSOR, 
                      HAND_CURSOR, MOVE_CURSOR, NE_RESIZE_CURSOR, NW_RESIZE_CURSOR,
                      TEXT_CURSOR, WAIT_CURSOR};
    int posCursor = 0; //para saber posicion en vector cursores
    Color colores[] = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY,
                        Color.GRAY, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE,
                        Color.PINK};
    int posColor1 = 0;
    int posColor2 = 0;
    String fuentes[] = {"Helvetica", "TimesRoman", "Courier", "Dialog", 
                        "DialogInput", "Arial"};
    int posLetra = 0;
    
    public static void main(String args[]){
        FrameApp app = new FrameApp();
    }
    
    public FrameApp(){
        super("Trabajando con Frames");
        tituloInicial = this.getTitle();
        setup();
        pack();
        resize(400,400);
        show(); 
    }
    
    /*Panel principal tiene 4 filas y 1 columna
    En la primera fila hay un texto con la clase label
    En la segunda hay 3 botones metidos en un panel
    En la tercera fila hay otro texto
    En la cuarta otros 4 botones
    */
    public void setup(){
        setupMenu();
        setupPaneles(); 
    }

    public void setupPaneles() throws HeadlessException {
        Panel principal = new Panel();
        principal.setLayout(new GridLayout(4,1)); // distribución con celdas
        //tiene 4 filas y 1 columna
        principal.add(new Label("Cambian las características de la ventana", Label.CENTER)); 
        //no necesita el nombre del objeto si no se va a cambiar
        
        Panel panelBotones = new Panel();
        panelBotones.add(new Button("Titulo")); //clase botón
        panelBotones.add(new Button("MenuBar")); 
        panelBotones.add(new Button("Resizable"));
        principal.add(panelBotones);
        
        principal.add(new Label("Salidas en la ventana", Label.CENTER)); 
        
        Panel panelBotones2 = new Panel();
        panelBotones2.add(new Button("Cursor"));
        panelBotones2.add(new Button("Background"));
        panelBotones2.add(new Button("Foreground"));
        panelBotones2.add(new Button("Font"));
        principal.add(panelBotones2);
        
        this.add("South", principal);
    }

    public void setupMenu() throws HeadlessException {
        porDefecto = new MenuBar();
        Menu fileMenu = new Menu("File");
        fileMenu.add(new MenuItem("Exit"));
        porDefecto.add(fileMenu);
        
        alternativo = new MenuBar();
        Menu fileMenu2 = new Menu("Archivo");
        fileMenu2.add(new MenuItem("Salir"));
        alternativo.add(fileMenu2);
        
        this.setMenuBar(porDefecto);
    }
    
    public void paint(Graphics g){
        g.drawString("Cambia el color al pulsar Foregroung...Guayando", 100, 150);
    }
    
    public boolean handleEvent(Event ev){
        if(ev.id == Event.WINDOW_DESTROY){ //si nombre evento es cerrar la ventana
            System.exit(0);
            return true;
        }
        else if(ev.id == Event.ACTION_EVENT){ //si se ha producido evento de accion
            if(ev.target instanceof Button){
                if(ev.arg.equals("Titulo")){ 
                    if(this.getTitle().equals(tituloInicial))
                        this.setTitle("XDDD");
                    else
                        this.setTitle(tituloInicial);
                    return true;            
                }
                else if(ev.arg.equals("MenuBar")){ 
                    if(this.getMenuBar().equals(porDefecto)) //compara direcciones de memoria
                        this.setMenuBar(alternativo);
                    else
                        this.setMenuBar(porDefecto);
                    return true;
                }
                else if(ev.arg.equals("Resizable")){
                    //para no poder modificar el tmñ de la ventana
                    this.setResizable(!this.isResizable());
                    //si le vuelves a dar al botón vuelve al modo por defecto
                    return true;
                }
                else if(ev.arg.equals("Cursor")){
                    //mod cursores.length para que cuando llegue al final 
                    // del vector vuelva a empezar
                    this.setCursor(cursores[(posCursor++)%cursores.length]);
                    return true;
                }
                else if(ev.arg.equals("Background")){
                    this.setBackground(colores[(posColor1++)%colores.length]);
                    return true;
                }
                else if(ev.arg.equals("Foreground")){
                    this.setForeground(colores[(posColor2++)%colores.length]);
                    return true;
                }
                else if(ev.arg.equals("Font")){
                    posLetra = (posLetra+1) % fuentes.length;
                    this.setFont(new Font(fuentes[posLetra], Font.ITALIC, 14));
                    return true;
                }
            }
        }
        return false;
    }
}


