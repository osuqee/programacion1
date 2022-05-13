
// Numero escaños segun la ley D'HONDT:

package primera;

public class Ejercicio096 {
    public static void main(String arg[]) {
        //String partidos[] = {"partido partidal","frente popular de judea","partido de mi culo"};
        String partidos[] = {"P1","P2","P3","P4","P5"};
        //int votos[] = {280000,340000,160000};
        int votos[] = {340000,280000,160000,60000,15000};
        final int NUMESCANOS = 7; // es una constante
        int cocientes[] = new int [partidos.length];
        for (int i=0; i<cocientes.length; i++)
            cocientes[i] = 1;
        
        for (int i=0; i<NUMESCANOS; i++) {
            int iMayor = 0;
            for (int j=1; j<partidos.length; j++)
                if (votos[j]/cocientes[j] > votos[iMayor]/cocientes[iMayor])
                    iMayor = j;
            
            //System.out.printf("El que tiene mas votos es: %s\n",partidos[iMayor]);
            //for (int k=0; k<partidos.length; k++)
                //System.out.printf("-->%s - %d\n",partidos[k],votos[k]/cocientes[k]);
            
            cocientes[iMayor]++;
            
            System.out.printf("Escano num. %d para %s\n",i+1,partidos[iMayor]);
        }
    }
}
