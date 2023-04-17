/**
 * 36 Escribe un programa que diga si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita
 * el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 * long en lugar de int ya que el primero admite números más largos.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        long numero = sc.nextLong();
        
        long aux =numero;
        long numeroReves= 0;
    
        while (aux > 0) {
            numeroReves = (numeroReves *10) + (aux % 10);
            aux /= 10;
        }

        if(numeroReves == numero){
            System.out.println("ES CAPICUO");
        } else
        System.out.println("NO ES CAPICUO");
        sc.close();
    }
}
