/*
 * 2 Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes 
 * o buenas noches según la hora. Se utilizarán los tramos de 
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las 
 * horas, los minutos no se deben introducir por teclado.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio2{
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime una hora en un formato de 24H: ");
        int  n = sc.nextInt();

        if(n >= 6 && n <= 12){
            System.out.print("Buenos días");
        }
        if(n >= 13 && n <= 20){
            System.out.print("Buenas tardes");
        }
        if(n >= 21 && n <= 24 || n<=5 && n>0){
            System.out.print("Buenas noches");
        } 
        if(n >= 24 || n <0){
            System.out.print("Lo siento no te he entendido, repita la hora por favor");
        }

        sc.close();
    }
}