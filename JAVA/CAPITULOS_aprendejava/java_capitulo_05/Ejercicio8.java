/**
 * 8 Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la tabla de multiplicar de un número: ");
        int n = sc.nextInt();
        
        for(int i = 0; i<=10; i++){
            System.out.println("La tabla sería: " + (i*n));
        }
    sc.close();
    }
}