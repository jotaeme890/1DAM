/**
 * 67 Realiza un programa que pinte una escalera que va descendiendo de izquierda
 * a derecha. El programa pedirá el número de escalones y la altura de cada
 * escalón. La anchura de los escalones siempre es la misma: 4 asteriscos.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio67 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la cantidad de escalones: ");
        int n = sc.nextInt();
        System.out.print("Dime la altura de los escalones: ");
        int altura = sc.nextInt();

        for(int i=1 ; i<=n ; i++){ //altura total
            for(int b=1 ; b<=altura ; b++){ //altura escalon
                for(int c=1 ; c<=i ; c++){ //pintamos asteriscos
                    System.out.print("****");
                }
                System.out.println("");
            }
        }
        sc.close();
    }
}
