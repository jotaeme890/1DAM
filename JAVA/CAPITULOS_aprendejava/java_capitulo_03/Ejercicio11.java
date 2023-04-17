/**
 * 11 Realiza un conversor de Kb a Mb.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la Kb que quieres pasasr a Mb: ");
        double n = sc.nextDouble();
        double c = n/1000;

        System.out.print("El resultado de dicha conversión es: " + c);
        sc.close();
    }
}
