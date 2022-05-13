
package Ejercicio06;

import java.awt.Frame;
import java.awt.Event;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.FileDialog;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class EditorApp extends Frame {
    TextArea texto;
    MenuBar menubar;
    FileDialog abrirFichero;
    FileDialog guardarFichero;
    
    public static void main(String arg[]) {
        EditorApp app = new EditorApp();
    }
    
    public EditorApp(){
        super("Editor de textos");
        setup();
        pack();
        resize(texto.getMinimumSize());
        show();
    }

    public void setup() throws HeadlessException {
        texto = new TextArea(25,50);
        add("Center",texto);
        setMenuBar();
        abrirFichero = new FileDialog(this,"Abrir Fichero", FileDialog.LOAD);
        guardarFichero = new FileDialog(this,"Guardar Fichero", FileDialog.SAVE);
    }

    public void setMenuBar() throws HeadlessException {
        menubar = new MenuBar();
        Menu archivoMenu = new Menu("Archivo");
        new MenuItem("Nuevo");
        archivoMenu.add(new MenuItem("Nuevo"));
        archivoMenu.add(new MenuItem("Abrir"));
        archivoMenu.addSeparator();
        archivoMenu.add(new MenuItem("Guardar"));
        archivoMenu.addSeparator();
        archivoMenu.add(new MenuItem("Salir"));
        menubar.add(archivoMenu);
        this.setMenuBar(menubar);
    }
    
    public boolean handleEvent(Event ev) {
        if(ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof MenuItem) {
                if (ev.arg.equals("Salir")) {
                    System.exit(0);
                    return true;
                } else if (ev.arg.equals("Nuevo")) {
                    texto.setText(" ");
                    return true;
                } else if (ev.arg.equals("Abrir")) {
                    abrirFichero.show();
                    leerFichero();
                    return true;
                } else if (ev.arg.equals("Guardar")) {
                    guardarFichero.show();
                    grabarFichero();
                    return true;
                }
            }
        }
        return false;
    }

    public void grabarFichero() {
        String outFile = guardarFichero.getDirectory() + guardarFichero.getFile();
        DataOutputStream outStream;
        try {
            outStream = new DataOutputStream(new FileOutputStream(outFile));
            outStream.writeBytes(texto.getText());
        } catch(FileNotFoundException e){}
        catch(IOException e2){}
    }

    public void leerFichero() {
        String inFile = abrirFichero.getDirectory() + abrirFichero.getFile();
        DataInputStream inStream;
        //cargar contenido del fichero en la app
        //requiere excepcion
        try {
            inStream = new DataInputStream(new FileInputStream(inFile));
            String nuevo_texto = "";
            String linea;
            //para poder usar esta instruccion necesitas el DataInputStream
            while((linea = inStream.readLine()) != null){
                nuevo_texto += linea + "\n"; //podría hacerse con concat tambien.
            }
            texto.setText(nuevo_texto);
        } catch (FileNotFoundException e){System.out.println(e);}
        catch (IOException e2){System.out.println(e2);}
    }
}
