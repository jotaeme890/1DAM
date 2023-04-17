/**
 * 46 Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
 * que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 * contrario se debe mostrar un mensaje de error.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la altura del rectángulo (mínimo debe ser 2): ");
        int alt = sc.nextInt();
        System.out.print("Dime la base del rectángulo (mínimo debe ser 2): ");
        int base = sc.nextInt();

        if (alt <2 || base < 2){
            System.out.print("ERROR!");
        } else {
            for (int i = 1; i <= base; i++) {
                System.out.print("X");
            }
            for (int i = 2; i < alt; i ++) {
                System.out.print("\nX");
                for (int espacios = 2; espacios < base; espacios++) {
                System.out.print(" ");
                }
                System.out.print("X");
                }
                System.out.println();
                for (int i = 1; i <= base; i++) {
                System.out.print("X");
                }
            sc.close();
        }
    }
}

