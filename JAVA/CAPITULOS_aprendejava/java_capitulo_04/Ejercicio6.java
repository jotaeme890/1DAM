/*
 * 6 Realiza un programa que calcule el tiempo que tardará en caer un objeto desde 
 * una altura h. Aplica la fórmula t =√2h/g siendo g = 9.81m/s2
 * 
 * @author jotaeme
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio6 {
    public static void main(String args []){
            Scanner sc = new Scanner (System.in);
            System.out.print("Dime el valor de la altura en metros: ");
            float  h = sc.nextFloat();

            if(h<=0){
                System.out.print("No se puede hayar la velocidad en una altura negativa");
            } else
                System.out.print("Tradaría un total de " + Math.sqrt(2*h/9.81) + " segundos");
        
        sc.close();
    } 
}