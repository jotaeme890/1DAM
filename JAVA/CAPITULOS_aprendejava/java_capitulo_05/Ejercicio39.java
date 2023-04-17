/**
 * 39 Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los números desde el 1 al número introducido junto
 *con su factorial.
 * 
 *  @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio39 {
    public static void main (String arrgs []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int n1 = sc.nextInt();

        for (int n = 1; n <= n1; n++) {
            long factorial = n;
        
        for (int i = 1 ; i < n ; i++){
            factorial *= i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
        }
        sc.close();
    }
}
