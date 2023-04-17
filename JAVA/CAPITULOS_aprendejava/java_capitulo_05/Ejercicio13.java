/**
 * 13 Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main (String args []){
        int positivo = 0;
        int negativo = 0;
        Scanner sc = new Scanner (System.in);
        for(int i = 1; i <= 10; i++){
            System.out.print("Dime un número: ");
            int n = sc.nextInt();

            if (n < 0){
                negativo++;
            } else 
            positivo++;
        }
        System.out.println("Has dicho un total de " + negativo + " números negativos y " + positivo + " positivos");
        sc.close();
    }
}
