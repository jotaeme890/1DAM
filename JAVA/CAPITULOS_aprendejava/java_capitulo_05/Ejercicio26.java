/**
 * 26 Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 * 
 * 
 */

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        System.out.print("Dime un número: ");
        int numero = sc.nextInt();
        System.out.println("");
        System.out.print("Dime un dígito: ");
        int digito = sc.nextInt();
        int aux =numero;
        int numeroReves= 0;
        int auxDigito = 0;
        int i = 0;
        

        while (aux > 0) {
            numeroReves = (numeroReves *10) + (aux %10);
            aux /= 10;
        }   

        while (numeroReves > 0) {
            auxDigito = numeroReves % 10;
            i++;
            
            if(auxDigito == digito){
                System.out.println("Posición " + i + ", del número introducido " + numero + " coincide con " + digito);
            }
            numeroReves /= 10;
        }

        sc.close();
    }
}
