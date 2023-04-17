/**
 *  27Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por teclado.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero mayor que 1: ");
        int n = sc.nextInt();
        int cuenta = 0;
        int suma = 0;

        if (n<1){
            System.out.println("Introduzca bien los valores, por favor ");
        } else{
        for (int i = 1; i <= n; i++) {
            if ((i % 3) == 0) {
            System.out.print(i + ", ");
            cuenta++;
            suma += i;
            } 
        }
        System.out.println("Hay un total de  " + cuenta + ", que son múltiplos de 3 y suman " + suma);
        }
        sc.close();
    }
}
