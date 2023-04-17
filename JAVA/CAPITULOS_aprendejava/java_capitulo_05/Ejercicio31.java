/**
 *  31 Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio31  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la altura de la L: ");
        int n = sc.nextInt();
        
        for(int i = 1 ; i< n ; i++){
            System.out.println("*");
        }
        for(int i = 0 ; i< n/2+1 ; i++){
            System.out.print("* ");
        }
        
    sc.close();
    }   
}
    

