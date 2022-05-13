
package Ejercicio10;
import java.awt.*;

public class DibujarApp extends Frame{
    MiCanvas canvas;
    
    public static void main(String arg[]) {
        DibujarApp app = new DibujarApp();
    }
    
    public DibujarApp() {
        super("Dibujando en el Frame");
        setup();
        pack();
        resize(400,400);
        show();
    }
    
    public void setup() {
        setupMenubar();
        canvas = new MiCanvas();
        this.add("Center", canvas);
    }

    public void setupMenubar() throws HeadlessException {
        MenuBar menubar = new MenuBar();
        Menu menu1 = new Menu("Fichero");
        menu1.add(new MenuItem("Nuevo"));
        menu1.addSeparator();
        menu1.add(new MenuItem("Salir"));
        menubar.add(menu1);
        
        Menu menu2 = new Menu("Dibujar");
        menu2.add(new MenuItem("Linea"));
        menu2.add(new MenuItem("Ovalo"));
        menu2.add(new MenuItem("Rectangulo"));
        menubar.add(menu2);
        
        this.setMenuBar(menubar);
    }
    
    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof MenuItem) {
                if (ev.arg.equals("Salir")) {
                    System.exit(0);
                    return true;
                } else if (ev.arg.equals("Linea")) {
                    canvas.setTipo(DosPuntos.LINEA);
                    return true;
                } else if (ev.arg.equals("Ovalo")) {
                    canvas.setTipo(DosPuntos.OVALO);
                    return true;
                } else if (ev.arg.equals("Rectangulo")) {
                    canvas.setTipo(DosPuntos.RECTANGULO);
                    return true;
                }
            }
        }
        return false;
    }
}
