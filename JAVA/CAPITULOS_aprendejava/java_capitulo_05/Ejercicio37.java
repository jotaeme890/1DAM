/**
 * 37 Realiza un conversor del sistema decimal al sistema de “palotes”.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio37 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        long numero = sc.nextLong();
        
        String palito = "|";
        String palito2 = "-";
        long aux =numero;
        long numeroReves= 0;

        while (aux > 0) { //dar la vuelta al número
            numeroReves = (numeroReves *10) + (aux % 10);
            aux /= 10;
        }

        while (numeroReves >= 10){ 
            for( int i = 1; i <= numeroReves%10 ; i++){
                System.out.print(palito); //poner el numero de palitos en funcion del numero cogido
            }
            System.out.print(palito2); //poner el numero de palitos en funcion del numero cogido
            numeroReves /= 10; //achicar el número
        }

        for( int i = 1; i <= numeroReves ; i++){
                System.out.print(palito); //poner el numero de palitos en funcion del numero cogido
        }
        
        sc.close();
    }
}
