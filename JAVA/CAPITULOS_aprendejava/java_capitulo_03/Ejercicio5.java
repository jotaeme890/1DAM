/**
 * 5 Escribe un programa que calcule el área de un rectángulo.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la altura del rectángulo: ");
        float n = sc.nextFloat();
        System.out.print("Dime la base del rectángulo: ");
        float c = sc.nextFloat();
        
        System.out.println("El área de ese rectángulo: "+ c*n);

        sc.close();
    }
}