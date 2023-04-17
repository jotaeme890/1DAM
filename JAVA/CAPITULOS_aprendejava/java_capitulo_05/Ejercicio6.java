/*
 * 6 Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle do-while.
 * 
 * @author jotaeme
 */

public class Ejercicio6 {
    public static void main(String args []){
        System.out.println("Vamos a mostrar los números del 320 hasta el 160 con un bucle do-while: ");

        int i =320;

        do {
            System.out.println(i);
            i=i-20;
        } while (i>=160);
    }
}