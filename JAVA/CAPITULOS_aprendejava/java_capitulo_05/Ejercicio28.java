/**
 *  28 Escribe un programa que calcule el factorial de un número entero leído por teclado.
 * Ejemplo:
 * Por favor, introduzca un número entero: 6
 * 6! = 720
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio28  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número para saber su factorial: ");
        int n = sc.nextInt();
        int factorial = n;

        if (n<0){
            System.out.println("Dime bien los valores, por favor ");
        } else{
        for (int i = 1; i<n; i++) {
            factorial*=i;
            } 
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
        sc.close();
    }   
}
