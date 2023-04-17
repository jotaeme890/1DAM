/*
 * 5 Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String args []){
            Scanner sc = new Scanner (System.in);
            System.out.print("Dime el valor de a: ");
            float  a = sc.nextFloat();
            System.out.print("Dime el valor de b: ");
            float  b = sc.nextFloat();
    
            if(a == 0){
                System.out.print("Esta ecuación no tiene solución real");
            } else if( a > 0 )
                System.out.print("La solución es: " + (-b/a));
    
    
            sc.close();
    }
}
