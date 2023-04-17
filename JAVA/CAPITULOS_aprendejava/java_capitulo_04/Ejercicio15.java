/*
 * 15 Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá 
 * ser una letra, un número o un símbolo como *, +, -, $, &, etc. 
 * El programa debe permitir al usuario mediante un menú elegir si el vértice 
 * de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
 * 
 * @author jotaeme
 */


import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String args []){
            Scanner sc = new Scanner (System.in);
            System.out.println("Dime la orientación de la pirámide");
            System.out.print("Siendo: 1)Arriba  2)Abajo  3)Izquierda  4)Derecha: ");

            int n = sc.nextInt();

            switch (n) {
                case 1:
                System.out.println("   *   ");
                System.out.println("  ***  ");
                System.out.println(" ***** ");
                System.out.println("*******");
                    break;
                case 2:
                System.out.println("*******");
                System.out.println(" ***** ");
                System.out.println("  ***  ");
                System.out.println("   *   ");
                    break;
                case 3:
                System.out.println("       * ");
                System.out.println("     * * ");
                System.out.println("   * * * ");
                System.out.println("     * * ");
                System.out.println("       * ");
                    break;
                case 4:
                System.out.println(" *   ");
                System.out.println(" * *   ");
                System.out.println(" * * * ");
                System.out.println(" * *  ");
                System.out.println(" *   ");

                default:
                    System.out.print("Dime bien los valores por favor");
            }

        sc.close();
    }
}