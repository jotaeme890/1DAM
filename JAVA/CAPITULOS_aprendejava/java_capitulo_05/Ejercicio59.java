/**
 * 59 Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
 * introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
 * que el usuario introduce una altura mayor o igual a 4
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la altura: ");
        int n = sc.nextInt();
        

        for(int estrella = 1; estrella <= n-1 ; estrella++){ //estrella del principio
            System.out.print(" ");
        }

        System.out.print("*");
        System.out.println("");

        for(int i = 1; i< n-2 ; i++){
            for(int espacioslat = 1; espacioslat <= n-i ; espacioslat++){
                System.out.print(" ");
                
            }
            System.out.print("^");
            for (int asteriscos=1; asteriscos<=((2*i)-1)-2; asteriscos++){
                System.out.print(" ");
            }
            if(i!=1){
                System.out.print("^");
            }
            System.out.println("");
        } 
        System.out.print("  ");
        for(int base=1;base<=(n-2)*2-1;base++){
            
            System.out.print("^");
        } 

        System.out.println("");
        for(int palo = n-1 ; palo < n;palo++){
            for(int espacios = 1; espacios <= n-1 ; espacios++){
                System.out.print(" ");
                
            }
            System.out.print("Y");
        }
        
        sc.close();
    }
}

