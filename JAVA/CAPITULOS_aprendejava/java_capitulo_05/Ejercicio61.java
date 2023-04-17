/**
 * 61 Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
 * la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
 * mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
 * debe mostrar un mensaje de error.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio61 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la altura: ");
        int n = sc.nextInt();
        if(n < 3){
            System.out.println("Dime bien los valores");
        } else{
            for (int i = 1 ; i <= n ; i++) /*Altura*/{
                for (int espacioslat = 0 ; espacioslat <= i-1 ; espacioslat++){
                    System.out.print(" ");
                }

                System.out.print("***");

                for(int espaciosint = (n-i)*2 ; espaciosint > 0 ; espaciosint--){
                    System.out.print(" ");
                }

                System.out.println("***");
            }
        }
        sc.close();
    }
}
