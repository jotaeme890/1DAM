/*
  * 20 Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa.
  *Se permiten números de hasta 5 cifras.
  *
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String args []){
            Scanner sc = new Scanner (System.in);
            System.out.println("Dime un número de hasta 5 cifras: ");
            int n = sc.nextInt();

            if(n>=0 && n<10){
                System.out.println("El número es capicúo");
            } else if(n>=10 && n<100 && n/10==n%10){
                System.out.println("El número es capicúo");
            } else if(n>=100 && n<999 && n/100==n%10){
                System.out.println("El número es capicúo");
            } else if(n>=1000 && n<9999 && (n/100)%10==(n%100)/10){
                System.out.println("El número es capicúo");
            } else if(n>=10000 && n<99999 && (n/1000)%10 == (n%100)/10){
            System.out.println("El número es capicúo");
            } else
            System.out.print("No es capicúo");
        sc.close();
    }
}