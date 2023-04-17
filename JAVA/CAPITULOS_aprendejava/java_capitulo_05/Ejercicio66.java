/**
 * 66 La Guardia Civil de Tráfico nos ha encargado un programa que pinte una señal
 * para desviar el tráfico hacia la derecha. La señal es una doble flecha con el
 * vértice apuntando a la derecha. Se pide al usuario la altura de la figura, que
 * debe ser un número impar mayor o igual que 3. La distancia entre cada flecha
 * de asteriscos es siempre de 4 espacios. Si la altura introducida por el usuario
 * no es un número impar mayor o igual que 3, el programa debe mostrar un
 * mensaje de error.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio66 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la altura (mayor o igual a 3): ");
        int n = sc.nextInt();

        if (n % 2==0){
            System.out.println("Dime bien los valores");
        } else if ( n < 3){
            System.out.println("Dime bien los valores");
        } else{
            for(int i =1; i <= (n/2)+1 ; i++){
                for(int espacioslat = 0 ; espacioslat <= (n/2)+i ; espacioslat++){
                    System.out.print(" ");
                }
                System.out.print("*    ");
                System.out.print("*");
                System.out.println("");
            }
    
            for(int i = n/2 ; i >= 1 ; i--){
                for(int espacioslat = 0 ; espacioslat <= (n/2)+i ; espacioslat++){
                    System.out.print(" ");
                }
                System.out.print("*    ");
                System.out.print("*");
                System.out.println("");
            } 
        }
        sc.close();
    }
}
