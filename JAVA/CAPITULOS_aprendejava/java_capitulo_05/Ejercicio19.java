/**
 * 19 Realiza un programa que pinte una pirámide por pantalla. La altura se debe 
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la figura: ");
        String figura = sc.next();
        System.out.print("Dime la altura: ");
        int n = sc.nextInt();
        

        for (int i = 1 ; i<=n ; i++){
            for(int espacios=n-i ; espacios>=0 ; espacios--)
            System.out.print(" ");
            for (int asteriscos=1; asteriscos<=(2*i)-1; asteriscos++){
                System.out.print(figura);
            }
            System.out.println("");
        }
    sc.close();
    }
}
