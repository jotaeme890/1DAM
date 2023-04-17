/**
 * 5 Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] num = new int [10];
        int max = num[0];
        int min = 2147483647;

        for(int i = 0; i <10 ; i++){ //bucle para pedir un número determinado de números para el array 
            System.out.print("Dime un número para el array: ");
            num [i] = sc.nextInt();
        }

        for(int i = 0; i<10;i++){ //comprobamos número a número del array cuál es mayor, y lo guardamos en máximo para su posterior uso
            if(num[i]>max){
                max=num[i];
            }
        }
        for(int i = 0; i<10;i++){ //comprobamos número a número del array cuál es menor, y lo guardamos en mínimo para su posterior uso
            if(num[i]<min){
                min=num[i];
            }
        }

        System.out.println();
        System.out.println("El array se quedaría: ");
        for(int i = 0; i <10 ; i++){ //imprimimos uno a uno y comprobamos si es igual el número a la variable min o max para poder añadirle mediante texto si es mínimo o máximo
            System.out.print(num[i] + "");
            if(num[i]==min){
                System.out.print(" mínimo");
            }
            if(num[i]==max){
                System.out.print(" máximo");
            }
            System.out.println();
        }
        sc.close();
    }
}
