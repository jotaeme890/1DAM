/**
 * 3 Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa
 * 
 * @author jotaeme
 */

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] num = new int [10];
        
        for(int i = 0; i < 10; i++){
            System.out.print("Dime un número: ");
            num [i] = sc.nextInt();
        }

        System.out.println("Ese array al revés sería: ");
        for(int i =9 ; i>=0 ; i--){
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}
