/*
  * 17 Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String args []){
            Scanner sc = new Scanner (System.in);
            System.out.println("Dime un número: ");
            int n = sc.nextInt();


            if(n >=10){
            System.out.print("El último valor del número es: " + n%10);
            } else if(n<=-10){
                n = n*(-1);
                System.out.print("El último valor del número es: " + n%10);
            } else
            System.out.print("Ese número solo tiene un número");
        sc.close();
    }
}
