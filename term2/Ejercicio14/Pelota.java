
package Ejercicio14;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Pelota extends Bloque{
    int velX, velY;
    
    public Pelota() {
        super(150,200,9,9,Color.pink);
        velX = -3;
        velY = -2;
    }
    
    public void actualizar(Raqueta raqueta, List<Ladrillo> ladrillos){
        this.x += velX;
        this.y += velY;
        
        if ((x<0)||(x>300-width)) {
            velX = -velX;
        } else if ((y<0)||(y>300-height)) {
            velY = -velY;
        }
        
        if (this.intersects(raqueta))
            this.velY = -this.velY;
        for (int n=0; n<ladrillos.size();n++) {
            if (this.intersects(ladrillos.get(n))) {
                this.velY = -this.velY;
                ladrillos.remove(n);
                break;
            }
            /*
            if (this.intersects(ladrillos.get(n))) {
                if (this.x < ladrillos.get(n).x)
                    this.velX = -this.velX;
                else if (this.x > ladrillos.get(n).x+ladrillos.get(n).width)
                    this.velX = -this.velX;
                else if (this.y > ladrillos.get(n).y+ladrillos.get(n).height)
                    this.velY = -this.velY;
                else if (this.y < ladrillos.get(n).y)
                    this.velY = -this.velY;
                ladrillos.remove(n);
            }*/
        }
        
        if (this.y > 260) {
            this.setLocation(500,500);
            this.velX = 0;
            this.velY = 0;
        }
    }
    
    public void dibujar (Graphics g) {
        g.setColor(color);
        g.fillOval(this.x, this.y, this.width, this.height);
        //g.drawString("FINAL DE LA PARTIDA :C", 140, 140);
    }    
}
