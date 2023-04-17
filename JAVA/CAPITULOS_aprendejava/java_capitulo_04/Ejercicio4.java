/*
 * 4 Vamos a ampliar uno de los ejercicios de la relación anterior para considerar 
 * las horas extras. Escribe un programa que calcule el salario semanal de un 
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo) se 
 * pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("¿Cuántos horas trabajas a la semana?");
        int  n = sc.nextInt();

        int horas = n*12;

        if(n <= 40){
            System.out.println("Cobrarás " + horas + " eurosa la semana");
        } else 
        System.out.println("Cobrarás " + ((40*12) + ((n - 40) *16)) + " euros a la semana");

        sc.close();
    }
}
