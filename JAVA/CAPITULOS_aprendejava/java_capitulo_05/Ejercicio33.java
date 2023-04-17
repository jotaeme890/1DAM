/**
 * 33 Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
 * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 * dos asteriscos menos en la base para simular la curvatura de las esquinas
 * inferiores.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio33 {
    public static void main (String args [] ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la altura de la U: ");
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++){
            if(i!=n){
                System.out.print("*  ");
                for(int b = 1; b<= n-2; b++){
                    System.out.print(" ");
                }
                System.out.println("  *");
                System.out.println("");
            } else if (i == n){
                for(int c = 2 ; c < n ; c++){
                    System.out.print("  ");
                    System.out.print("*");
                }
            }
        }
        sc.close();
    }
}
