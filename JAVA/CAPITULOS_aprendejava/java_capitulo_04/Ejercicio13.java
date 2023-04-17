/*
 * 13 Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * @author jotaeme
 */


import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String args []){
            Scanner sc = new Scanner (System.in);
            System.out.print("Dime un número: ");
            float n = sc.nextFloat();
            System.out.print("Dime  otro número: ");
            float n2 = sc.nextFloat();
            System.out.print("Dime otro número:  ");
            float n3 = sc.nextFloat();

            if (n < n2  && n < n3 && n2 <n3){
                System.out.print("El orden es: " + n + ", " + n2 + ", " + n3);
            } 
            else if (n < n2  && n < n3 && n3 <n2){
                System.out.print("El orden es: " + n + ", " + n3 + ", " + n2);
            } 
            else if (n2 < n  && n2 < n3 && n <n3){
                System.out.print("El orden es: " + n2 + ", " + n + ", " + n3);
            } 
            else if (n2 < n  && n2 < n3 && n3 <n){
                System.out.print("El orden es: " + n2 +", " + n3 + ", " + n);
            } 
            else if (n3 < n  && n3 < n2 && n2 <n){
                System.out.print("El orden es: " + n3 +", " + n2 + ", " + n);
            }
            else if (n3 < n  && n3 < n2 && n <n2){
                System.out.print("El orden es: " + n3 +", " + n + ", " + n2);
            }
            else
            System.out.print("Dime bien los valores");
        sc.close();
    }
}