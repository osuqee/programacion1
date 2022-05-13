
package Ejercicio13;

import java.awt.*;

public class Pelota extends Rectangle{    
    //x,y: 0-250
    //ancho,alto: 10-25
    Color color;
    Color colores[] = {Color.green,Color.cyan,Color.magenta,Color.pink,Color.gray,Color.yellow};
    int velX, velY = 2;
    // ambos tienen valor inicial 2
    
    public Pelota() {
        // con Math.random obtienes un numero aleatorio entre 0 y 1 SIN incluir el 1.
        super((int)(Math.random()*250),(int)(Math.random()*250),0,0);
        int diametro = (int)(Math.random()*25)+10;
        width = height = diametro;
        color = colores[(int)(Math.random()*colores.length)];
        velX = (int)(Math.random()*5+1);
        velY = (int)(Math.random()*5+1);
    }
    
    public void actualizar(){
        if ((x<0)||(x>300-width)) {
            velX = -velX;
            color = colores[(int)(Math.random()*colores.length)];
        }
        else if ((y<0)||(y>300-height)) {
            velY = -velY;
            color = colores[(int)(Math.random()*colores.length)];
        }
        this.x += velX;
        this.y += velY;
    }
    
    public void dibujar (Graphics g) {
        g.setColor(color);
        g.fillOval(this.x, this.y, this.width, this.height);
    }
    
    
}
