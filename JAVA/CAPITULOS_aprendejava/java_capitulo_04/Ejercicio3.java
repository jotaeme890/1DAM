/*
 * 3 Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente 
 * nombre del día de la semana
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio3{
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número para saber el día de la semana (del 1-7): ");
        int  n = sc.nextInt();

        switch(n) {
            case 1:
                System.out.println("Este número corresponde al Lunes");
            break;

            case 2:
                System.out.println("Este número corresponde al Martes");
            break;

            case 3:
                System.out.println("Este número corresponde al Miércoles");
            break;

            case 4:
                System.out.println("Este número corresponde al Jueves");
            break;

            case 5:
                System.out.println("Este número corresponde al Viernes");
            break;

            case 6:
                System.out.println("Este número corresponde al Sábado");
            break;

            case 7:
                System.out.println("Este número corresponde al Miércoles");
            break;
        }
        sc.close();
    }
}
