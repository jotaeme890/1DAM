/**
 * 3 Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere 
 * convertir debe ser introducida por teclado.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la cantidad de pesetas: ");
        int n = sc.nextInt();
        double euros = 0.0060;
        
        System.out.printf("%d son %.2f euros",n,n*euros);

        sc.close();
    }
}
