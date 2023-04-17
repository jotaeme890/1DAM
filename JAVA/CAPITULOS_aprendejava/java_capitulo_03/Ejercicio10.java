/**
 * 10 Realiza un conversor de Mb a Kb.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la Mb que quieres pasasr a Kb: ");
        float n = sc.nextInt();
        float c = n*1000;

        System.out.print("El resultado de dicha conversión es: " + c);
        sc.close();
    }
}