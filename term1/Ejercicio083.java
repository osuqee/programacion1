
// ordenar las palabras en orden alfabético

package primera;

public class Ejercicio083 {
    public static void main(String arg[]) {
        String cad = "5cinco 6seis 4cuatro 2dos 3tres 1uno ";
        int cont = 0;
        int posicion = cad.indexOf(" ");
        while (posicion != -1) {
            cont++;
            posicion = cad.indexOf(" ",posicion+1);
        }
        
        String aux[] = new String [cont];
        
        
        //cont = 0;
        //posicion = cad.indexOf(" ");
        int ind2 = 0; // lleva el indice del vector. 
        int inicio = 0;
        int fin = cad.indexOf(" ");
        while (fin != -1) {
            aux[ind2] = cad.substring(inicio,fin+1);
            ind2++;
            inicio = fin+1;
            fin = cad.indexOf(" ",fin+1);
        }
        /*for (int i=0; i<aux.length; i++) {
            aux[i] = cad.substring(ind2,cad.indexOf(" ",posicion));
            cont++;
            ind2 = cad.indexOf(" ",ind2+1)+1;
            posicion = cad.indexOf(" ",posicion+1);
        }*/
        
        for (int i=0; i<aux.length; i++)
            for (int k=aux.length-1; k>i; k--)
                if (aux[k].compareTo(aux[k-1]) < 0) {
                    String aux2 = aux[k];
                    aux[k] = aux[k-1];
                    aux[k-1] = aux2;
                }
        
        cad = "";
        for (int l=0; l<aux.length; l++) {
            cad = cad.concat(aux[l]);
        }
        
        System.out.println(cad);
    }
}
