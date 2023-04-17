/**
 * 20 Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * 
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la altura: ");
        int n = sc.nextInt();
        

        for (int i=1; i<=n-1 ; i++){
            for(int espacios=n-i ; espacios>0 ; espacios--){
                System.out.print(" ");
            }
            System.out.print("*");

            for (int asteriscos=1; asteriscos<=((2*i)-1)-2; asteriscos++){
                System.out.print(" ");
            }

            if(i!=1){
            System.out.print("*");}


            System.out.println("");
            
        }
        
        for (int asteriscos=1; asteriscos<=n*2-1; asteriscos++){
            System.out.print("*");
        }
    sc.close();
    }
}