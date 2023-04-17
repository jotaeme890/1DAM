/**
 * 62 Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9.
 * Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un
 * número es afortunado si contiene más números de la suerte que de la mala
 * suerte. Realiza un programa que diga si un número introducido por el usuario
 * es afortunado o no
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio62 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        long numero = sc.nextLong();
        long aux =numero;
        long digito=0;
        long numeroReves= 0;
        int conts= 0;
        int conti = 0;

        while (aux > 0) {
            numeroReves = (numeroReves *10) + (aux % 10);
            aux /= 10;
        }
        while(numeroReves > 0 ){
            digito = numeroReves % 10;
            if( digito == 3 || digito == 8 || digito == 7 || digito == 9 ){
                conts++;
            } else{
                conti++;
            }
            numeroReves /= 10;
        }

        if(conts > conti){
            System.out.println("Ese número es de la suerte");
        } else if(conti > conts){
            System.out.println("Ese número no es de la suerte");
        }
        sc.close();
    } 
}
