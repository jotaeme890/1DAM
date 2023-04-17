/**
 * 53 Realiza un programa que pinte un triángulo relleno tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la altura: ");
        int n = sc.nextInt();
        
        for (int i = n ; i>=1 ; i--){
            for (int asteriscos=1; asteriscos<=i; asteriscos++){
                System.out.print("X");
            }
            System.out.println("");
        }
    sc.close();
    }
}
