/**
 * 55 Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
 * dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo dígito, se
 * queda igual.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio55 {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int numero = sc.nextInt();
        int digit = numero%10; //quitamos último dígito
        numero/=10; //achicamos el número
        System.out.print(digit);
        System.out.print(numero);
        sc.close();
    }
}