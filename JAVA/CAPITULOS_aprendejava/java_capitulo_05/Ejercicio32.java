/*
 * 32 Escribe un programa que, dado un número entero positivo, diga cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
 * izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
 * números largos.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio32 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        long numero = sc.nextLong();

        long aux =numero;
        long numeroReves= 0;
        long digito = 0;
        long sumap = 0;

        while (aux > 0) {
            numeroReves = (numeroReves *10) + (aux % 10);
            aux /= 10;
        }
        
        while(numeroReves > 0 ){
            digito = numeroReves % 10;

            numeroReves /= 10;
            
            if( digito % 2 == 0){
                sumap = sumap + digito;
                System.out.println("El dígito " + digito + " es par");
            }
        }
        System.out.println("La suma de los pares es: " + sumap);
        sc.close();
    }
}
