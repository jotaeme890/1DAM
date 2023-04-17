import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        int opcion = (int)(Math.random()*5);

        switch (opcion) {
            case 0:
                throw new NumberFormatException();
            case 1:
                throw new IOException();
            case 2:
                throw new FileNotFoundException();
            case 3:
                throw new IndexOutOfBoundsException();
            case 4:
                throw new ArithmeticException();
            default:
                break;
        }
    }
}


/* FORMA SI SUPIESEMOS HACER ARRAYLIST

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class S14Ejercicio03 {

    public static void main(String[] args) {
        ArrayList<Exception> excepciones = new ArrayList<Exception>();
        
        excepciones.add(new NumberFormatException());
        excepciones.add(new IOException());
        excepciones.add(new FileNotFoundException());
        excepciones.add(new IndexOutOfBoundsException());
        excepciones.add(new ArithmeticException());
        
        try {
        throw excepciones.get((int)(Math.random() * 6));
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
 */
