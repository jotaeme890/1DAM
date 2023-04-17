/**
 * 11 Escribe un programa que muestre en tres columnas, el cuadrado y el cubo 
 * de los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Dime un número entero: ");
        int n = sc.nextInt();

        System.out.println("Números  Potencia 2  Potencia 3 ");
        System.out.println("--------------------------------");
        for(int i = n; i<=n+5; i++){
            System.out.printf("%4d %9d %12d  \n",i ,(i*i), (i*i*i) );
        }
        sc.close();
    }
}
