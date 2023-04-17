/**
 * 51 El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
 * (todos los que encuentre). Realiza un programa que muestre un número antes
 * y después de haber sido comido por el gusano. Si el animalito no se ha comido
 * ningún dígito, el programa debe indicarlo.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        long numero = sc.nextLong();

        long aux =numero;
        long numeroReves= 0;
        long numeroReves2= 0;
        long digito = 0;

        while (aux > 0) {
            numeroReves = (numeroReves *10) + (aux % 10);
            aux /= 10;
        }
        
        while(numeroReves > 0 ){
            digito = numeroReves % 10;
            if( digito == 0 || digito == 8){
                System.out.print("");
            } else{
                numeroReves2 = ((numeroReves2 * 10)) + (digito);
            }
            numeroReves /= 10;
        }

        System.out.print("El resultado del número es: " + numeroReves2);
        sc.close();
    }
}


