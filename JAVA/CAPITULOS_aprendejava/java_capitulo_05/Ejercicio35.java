/**
 * 35 Realiza un programa que pinte una X hecha de asteriscos. El programa debe
 * pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
 * igual a 3, en caso contrario se debe mostrar un mensaje de error.
 * 
 * @author jotaeme
 */

import java.util.Scanner; 

public class Ejercicio35 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Dime la altura de la X: ");
        int n = sc.nextInt();

        if(n %2 == 0){
            System.out.println("Dime bien los valores");
        }if(n < 3){
            System.out.println("Dime bien los valores");
        } else{
            for (int i = 1 ; i <= n/2 ; i++) /*Altura*/{
                for(int espacioslat = 0 ; espacioslat < i ; espacioslat++) { /*Creamos los espacios laterales */
                    System.out.print(" ");
                }
                System.out.print("*"); /* Asterisco primero de la X */
                
                for(int espaciosint = n - (i*2) ; espaciosint > 0 ; espaciosint --){ /*Creamos los espacios interiores */
                    System.out.print(" ");
                }
                System.out.print("*"); /* Asterisco final de la X */
                System.out.println();
            }
    
            for(int central = 0; central <= n/2; central++){
                System.out.print(" ");
            }
            System.out.println("*");
    
            for (int i = n/2 ; i >= 1 ; i--) /*Altura*/{ //int i = n/2 i 1
                for(int espacioslat = 0 ; espacioslat < i ; espacioslat++) { /*Creamos los espacios laterales */
                    System.out.print(" ");
                }
                System.out.print("*"); /* Asterisco primero de la X */
                
                for(int espaciosint = n - (i*2) ; espaciosint > 0 ; espaciosint --){ /*Creamos los espacios interiores */
                    System.out.print(" ");
                }
                System.out.print("*"); /* Asterisco final de la X */
                System.out.println();
            }
        }
        sc.close();
    }
}