/**
 * 54 Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio54 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la altura: ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            System.out.print("X");
        }
        
        System.out.println("");

        for(int i=1;i<=n-2;i++){
            System.out.print("X");
            for(int b=n-2;i<b;b--){
                System.out.print(" ");
            }
            System.out.print("X");
            System.out.println("");
        }
        System.out.print("X");
    sc.close();
    }
}
