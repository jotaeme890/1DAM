/**
 * 58 Realiza un programa que calcule la media de los dígitos que contiene un número
 * entero introducido por teclado.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        long numero = sc.nextLong();

        long aux =numero;
        long numeroReves= 0;
        long digito = 0;
        int suma = 0;
        int cont = 0;

        while (aux > 0) {
            numeroReves = (numeroReves *10) + (aux % 10);
            aux /= 10;
        }
        
        while(numeroReves > 0 ){
            digito = numeroReves % 10;
            numeroReves /= 10;
            suma += digito;
            cont++;
        }

        System.out.print("La media de los dígitos es: " + (suma/cont));
        sc.close();
    }
}
