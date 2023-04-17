/**
 * 4 Escribe un programa que sume, reste, multiplique y divida dos números introducidos por teclado.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número: ");
        float n = sc.nextFloat();
        System.out.print("Dime otro número: ");
        float c = sc.nextFloat();
        
        System.out.println("Dado esos números: ");
        System.out.println("La suma es: "+ (n+c));
        System.out.println("La resta es: " + (n-c));
        System.out.println("La multiplicación es: "+ (n*c));
        if (c!=0){
            System.out.println("La división es: "+(n/c));
        } else 
            System.out.println("Dado esos números no se puede hacer la división");

        sc.close();
    }
}