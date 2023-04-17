/**
 * 10 Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        
        int cont = 0;
        double suma = 0;
        int n = 0;

        do {
            System.out.println("Dime números, cúando pongas un -1 hara la media: ");
            n = sc.nextInt();
            if(n>=0){
                suma = n + suma;
                cont++;
            }
        } while (n>=0);{
            if(cont>0){
                System.out.println("Tu media es: " + suma/cont);
            } else
            System.out.println("Dime bien los valores");
            
        }
        sc.close();
    }
    
}
