/*
 * 11 Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar a la medianoche.
 * 
 * @author jotaeme
 */


import java.util.Scanner;
import java.lang.Math;

public class Ejercicio11 {
    public static void main(String args []){
            Scanner sc = new Scanner (System.in);
            System.out.print("Dime la hora separando las horas (formato 24H) y los minutos separando por coma:  ");
            float n = sc.nextFloat();

            if(n<25 && n>0){
            double mn = 24*3600-(((int)n)*3600 + Math.floor(((n - (int)n)*100)*60));
            System.out.print("Quedan " + mn + " segundos para media noche");
            } else 
            System.out.print("Dime bien la hora por favor");
            
        sc.close();
    }
}