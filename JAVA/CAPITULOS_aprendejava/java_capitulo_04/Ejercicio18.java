/*
  * 18 Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten números de hasta 5 cifras
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String args []){
            Scanner sc = new Scanner (System.in);
            System.out.println("Dime un número de hasta 5 cifras: ");
            int n = sc.nextInt();

            if(n<10 && n >=0){
                System.out.print("La primera cifra es: " + n);
            } else if(n>=10 && n<=99){
                System.out.print("La primera cifra es: " + n/10);
            } else if(n>=100 && n<=999){
                System.out.print("La primera cifra es: " + n/100);
            } else if(n>=1000 && n<=9999){
                System.out.print("La primera cifra es: " + n/1000);
            } else if(n>=10000 && n<=99999){
                System.out.print("La primera cifra es: " + n/10000);
            } else
                System.out.println("Dime bien los valores por favor");
        sc.close();
    }
}