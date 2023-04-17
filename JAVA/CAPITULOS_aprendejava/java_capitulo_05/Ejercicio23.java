/** 
 * 23 Escribe un programa que permita ir introduciendo una serie indeterminada
 *de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 * 
 * @author jotaeme
*/



import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);

        float suma=0;
        float n;
        float cont = 0;

        do {
            System.out.print("Dime un número para añadirlo a la suma: ");
            n =sc.nextFloat();
            suma += n;

            cont ++;

        } while (suma < 10000);
        System.out.println("El total de la suma es: " + suma);
        System.out.println("El total de valores introducido es: " + cont);
        System.out.println("La media es: " + suma/cont);



        sc.close();
    }
}
