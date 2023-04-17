/**
 * 16 Escribe un programa que diga si un número introducido por teclado es o no primo.
 *  Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
 * 
 * @author jotaeme
 */
    

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int n = sc.nextInt();

        boolean esprimo = true;
        
        if(n<=0){
            System.out.println("ERROR!");

        } else if (n>0){

            if(n%2==0){
                esprimo = false;}

            for (int i = 3 ; i<= n/2 && esprimo; i+=2){
                if(n%i == 0){
                    esprimo = false;
                }
            }
        }
        if(esprimo){
            System.out.println("ES PRIMO");
        } else 
        System.out.println("NO ES PRIMO");
        
        sc.close();
    }
}


