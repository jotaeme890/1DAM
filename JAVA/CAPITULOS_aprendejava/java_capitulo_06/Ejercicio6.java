/**
 * 6 Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe 
 * adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
 * el programa dirá cuántas oportunidades quedan y si el número introducido es
 * menor o mayor que el número secreto.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean salir = true;
        int i = 0;
        int contraseña = 0;
        contraseña = (int)(Math.random()*101);
        int numero;

        do {
            System.out.print("Dime un número: ");
            numero = sc.nextInt();
            if(numero == contraseña){
                salir = false;
                System.out.println("ENHORABUENA HAS SALIDO");
            }

            if(contraseña < numero){
                System.out.println("Ese número es mayor a la contraseña");
            } else if (contraseña > numero){
                System.out.println("Ese número es menor a la contraseña");
            }

            i++;
            System.out.println("Llevas " + i + " intentos");

        } while (i < 5 && salir);
        if(i==5){
            System.out.println("No has averiguado la contraseña");
        }
        sc.close();
    }
}
