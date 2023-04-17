/**
 *  29 Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio29  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número, debe ser el mayor: ");
        int n = sc.nextInt();
        System.out.print("Dime otro número, debe ser el menor: ");
        int n2 = sc.nextInt();

        if (n2>n){
            System.out.println("Por favor, dime bien los valores");
        } else if (n == n2){
            System.out.println("Por favor, dime bien los valores");
        } else
            for (int i = 1; i<n ; i++){
                if (i % n2 == 0) {
                    System.out.print(i + ", ");
                }
            }
        
    sc.close();
    }   
}