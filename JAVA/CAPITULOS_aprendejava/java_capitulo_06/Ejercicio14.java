/**
 * 14 Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
 * programa intentará adivinar el número que estás pensando - un número entre 0
 * y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
 * debe preguntar si el número que estás pensando es mayor o menor que el que
 * te acaba de decir
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        int numero = 0;
        boolean salir = true; 
        int i = 0;

        do {
            numero = (int)(Math.random()*101);  
            System.out.println("El ordenador, ha pensado en el número: " + numero);
            if(numero == n){
                salir = false;
                System.out.println("La máquina a acertado el número");
            }

            i++;
        } while (i < 5 && salir);
        if(i==5){
            System.out.println("No ha podido averiguar la contraseña");
        }
        sc.close();
    }
}
