/**
 * 9 Escribe un programa que calcule el volumen de un cono según la fórmula V = 1|3πr2h
 * 
 * @author jotaeme
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio9 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura del cono: ");
        double h = sc.nextDouble();
        System.out.println("Dime el radio del cono: ");
        double r = sc.nextDouble();
        double partido= (1.0/3.0);

        System.out.print("El volumen del cono es: " + (partido*Math.PI*(r*r)*h));

        sc.close();
    }
}