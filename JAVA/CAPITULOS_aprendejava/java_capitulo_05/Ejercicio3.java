/*
 * 3 Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.

 * 
 * @author jotaeme
 */

public class Ejercicio3 {
    public static void main(String args []){
        System.out.println("Vamos a mostrar los números de 5 en 5 hasta llegar al 100 con un bucle do-while: ");

        int i = 0;

        do {
                System.out.println(i);
                i=i+5;
        } while (i<=100);
    }
}