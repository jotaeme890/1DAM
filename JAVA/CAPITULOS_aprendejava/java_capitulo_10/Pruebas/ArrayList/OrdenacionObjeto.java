package Pruebas.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenacionObjeto {
    public static void main(String[] args) {
        ArrayList<Gato> g = new ArrayList<Gato>();
        g.add(new Gato("Garfield", "naranja", "mestizo"));
        g.add(new Gato("Pepe", "gris", "angora"));
        g.add(new Gato("Mauri", "blanco", "manx"));
        g.add(new Gato("Ulises", "marrón", "persa"));
        g.add(new Gato("Adán", "negro", "angora"));
        //AL USAR EL compareTo en la clase Gato, podemos ordenarlos como queramos
        Collections.sort(g);

        System.out.println("\nDatos de los gatos ordenados por nombre:");

        for (Gato gatoAux: g) {
            System.out.println(gatoAux+"\n");
        }
    }
}
