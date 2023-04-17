/**
 * 57 Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio57 {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la altura de la pirámide: ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int espacios=n-i;espacios<n-1;espacios++){
                System.out.print(" ");
            }
            if(i==n || i==1){
                for(int asteriscos=1;asteriscos<=(n-i)+1;asteriscos++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(int asteriscos=1;asteriscos<=(n-i)-1;asteriscos++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        } 
    sc.close();
    }
}
