/**
 * 1 Convertor de euros a pesetas, cogiendo los euros por el teclado
 * 
 * @author Jotaeme
 */

/**
 * 2 Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere 
 * convertir debe ser introducida por teclado.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la cantidad de euros: ");
        double n = sc.nextDouble();
        double pesetas = 166.38;
        
        System.out.printf("%.2f son %d pesetas",n,(int)(n*pesetas));
        
        sc.close();
    }
}