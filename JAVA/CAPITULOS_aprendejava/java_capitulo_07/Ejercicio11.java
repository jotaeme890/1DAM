/**
 * 11 Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que no
 * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
 * array resultante.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] n = new int[10];
        int[] primo = new int[10];
        int[] noPrimo = new int[10];
        int i;
        int b;
        int primos = 0;
        int noPrimos = 0;
        boolean esPrimo = false;
        
        for (i = 0; i < 10; i++) {
            System.out.print("Dime un número para el array: ");
            n[i] = sc.nextInt();
            esPrimo = true;
            for (b = 2; b < n[i] - 1; b++) { //Vemos si es un número primo
                if (n[i] % b == 0) {
                esPrimo = false;
                }
            }
            if (esPrimo) { //Si es primo añadimos dicho número del array n con índice i, al array primo en la posición, inicial 0 pero va incrementando y al igual con el else
                primo[primos++] = n[i];
            } else {
                noPrimo[noPrimos++] = n[i];
            }
        }
        
        System.out.println("\n\nArray original:"); //Creamos la tabla original
        System.out.print(" Índice ");
        for (i = 0; i < 10; i++) {
            System.out.printf("%4d ", i);
        }

        System.out.println("");
        System.out.print(" Valor  ");

        for (i = 0; i < 10; i++) {
            System.out.printf("%4d ", n[i]);
        }

        for (i = 0; i < primos; i++) { //Añadimos al array n con el índice dado por el bucle hasta que llegue a su máximo, lo que hicimos antes era una especie de contador
            n[i] = primo[i];
        }
        
        for (i = primos; i < primos + noPrimos; i++) { //Hacemos lo mismo que en el anteriorpero, en este caso hacemos la suma para abarcar todo el array y la resta es para saber los espacios libres que nos quedan para acabar el array
            n[i] = noPrimo[i - primos];
        }


        System.out.println("\n\nArray con los primos al principio:");
        System.out.print(" Índice ");

        for (i = 0; i < 10; i++) {
            System.out.printf("%4d ", i);
        }
        System.out.println("");
        System.out.print(" Valor  ");

        for (i = 0; i < 10; i++) {
            System.out.printf("%4d ", n[i]);
        }
    }
}