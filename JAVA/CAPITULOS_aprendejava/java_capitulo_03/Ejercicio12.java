/**
 * 12 Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura Programación 
 * para obtener la media deseada. Hay que tener en cuenta que la nota del primer examen cuenta el 40% y 
 * la delsegundo examen un 60%.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué has sacado en el primer examen?");
        double n = sc.nextDouble();
        System.out.println("¿Qué quieres sacar en la evaluación?");
        double c = sc.nextDouble();

        System.out.print("La nota que tienes que sacar es: " + ((c-n*0.40)/0.60));
        sc.close();
    }
}