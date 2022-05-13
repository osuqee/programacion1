
// trimestre mas nacimientos
// mes con mas bajas (defunciones y traslados)
// num personas nuevas en el pueblo y cuantas desaparecido (venir=nacer y asentar)

package primera;

public class Ejercicio097 {
    public static void main(String arg[]) {
        String movimientos[] = {"nacimientos", "defunciones", "traslados fuera","nuevos asentamientos"};
        String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int movPoblacion[][] = {{1,2,3,4},{50,20,30,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        int nacimientos[] = {0,0,0,0};
        int mesMalo = 0;
        int nuevos = 0;
        
        for (int i=0; i<movPoblacion.length; i++) {
            nacimientos[i/3] += movPoblacion[i][0];
            if (movPoblacion[i][1]+movPoblacion[i][2] > movPoblacion[mesMalo][1]+movPoblacion[mesMalo][2])
                mesMalo = i;
            nuevos += movPoblacion[i][0] + movPoblacion[i][3];
        }
        
        int masNac = 0;
        for (int i=0; i<nacimientos.length; i++)
            if (nacimientos[0] > nacimientos[masNac])
                masNac = i;
        
        System.out.println("Trimestre más nacimientos: " + (masNac+1));
        System.out.println("Mes malo: " + (movPoblacion[mesMalo][1]+movPoblacion[mesMalo][2]));
        System.out.println("Nuevos: " + nuevos);
    }
}
