/**
 *  6 Escribe un programa que calcule el total de una factura a partir de la base imponible 
 * (precio sin IVA). La base imponible estará almacenada en una variable.
 * 
 * @author jotaeme
 */

import java.util.Scanner;
public class Ejercicio6 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el total de la base de la factura: ");
        double n = sc.nextInt();

        
        System.out.print("El total de la factura es: " + n+(n*0.21));

        sc.close();
    }
}
