/**
 * 14 Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.
 * 
 * @author jaotaeme
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la base: ");
        int base = sc.nextInt();
        System.out.print("Dime el exponente: ");
        int exponente = sc.nextInt();
        double elevado = 1;
        
        if (exponente == 0) {
        elevado = 1;
        }

        if (exponente > 0) {
        for (int i = 0; i < exponente; i++) {
        elevado *= base;
            }
        }

        if (exponente < 0) {
        for (int i = 0; i < -exponente; i++) {
        elevado *= base;
            }
        elevado = 1/elevado;
        }

        System.out.println(base + "^" + exponente + " = " + Math.pow(base,exponente));

        sc.close();
    }
}

