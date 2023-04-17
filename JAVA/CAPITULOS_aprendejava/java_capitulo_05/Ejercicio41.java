/**
 * 41 Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.
 * 
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio41 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        long numero = sc.nextLong();
        long aux =numero;
        long numeroReves= 0;
        int contp = 0;
        int conti = 0;

        while (aux > 0) {
            numeroReves = (numeroReves *10) + (aux % 10);
            aux /= 10;

            if (numeroReves %2 == 0){
                contp ++;
            } else {
                conti ++;
            }
        }
        System.out.print("El número " + numero + " tiene un total de " + contp + " dígitos pares" + " y un total de " + conti + " impares");

        sc.close();
    } 
}
