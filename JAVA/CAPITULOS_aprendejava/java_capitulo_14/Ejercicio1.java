/**
 * 1 Realiza un programa que pida 6 números por teclado y nos diga cuál es el
 * máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
 * entero) el programa debe indicarlo y debe pedir de nuevo el número.
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] numeros = new int [6];

        System.out.println("Dime 6 números");
        for(int i = 1; i <= numeros.length; i++){
            boolean salir = false;
            do {
                try {
                    System.out.print("Nº " + i + ":");
                    numeros[i] = Integer.parseInt(sc.nextLine());
                    salir = true;
                }catch (Exception ime) {
                    System.out.println("Los datos introducidos no son correctos.");
                    System.out.println("Se deben introducir números enteros.");
                }
            } while (!salir);
        }
        int max = 0;
    
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > max){
                max = numeros[i];
            }
        }
        System.out.println("El máximo de esos números es: " + max);
        sc.close();
    }
}
