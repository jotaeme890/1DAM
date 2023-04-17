/**
 *  43 Escribe un programa que permita partir un número introducido por teclado en
 * dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
 * el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
 * el número introducido tiene dos dígitos como mínimo y la posición en la que
 * se parte el número está entre 2 y la longitud del número. No se permite en
 * este ejercicio el uso de funciones de manejo de String (por ej. para extraer
 * subcadenas dentro de una cadena).
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio43 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        long numero = sc.nextLong();
        System.out.print("Dime la posición a partir: ");
        int partir = sc.nextInt();
        
        long aux =numero;
        int cont = 1;
        long auxiliar = 0;

        while (aux >= 10) { //saber la longitud del número
            aux = aux/10;
            cont++;
        }

        if(partir > cont){
            System.out.println("Dime bien los valores");
        } else if(partir == cont){
            System.out.println("Dime bien los valores");
        }  else if (partir < cont){
            for(int i = 0 ; i < (cont-partir)+1 ; i++){
                auxiliar +=(int)(numero%10)*Math.pow(10,i);
                numero /= 10;
            }

            System.out.println("Los valores son " + numero + " y parte en " +auxiliar);
        }
        sc.close();
    }
}

