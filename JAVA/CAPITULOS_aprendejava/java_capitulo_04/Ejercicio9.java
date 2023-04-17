/*
 * 9 Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).
 * 
 * @author jotaeme
 */


import java.util.Scanner;
import java.lang.Math;

public class Ejercicio9 {
    public static void main(String args []){
            Scanner sc = new Scanner (System.in);
            System.out.print("Dime el valor de a: ");
            int  a = sc.nextInt();
            System.out.print("Dime el valor de b: ");
            int  b = sc.nextInt();
            System.out.print("Dime el valor de c: ");
            int  c = sc.nextInt();
            float raiz = (b*b-4*a*c);
            String ecuacion = a+ "x^2 + " + b + "x + " + c;

            if (raiz >= 0 &&  2*a!=0){
            System.out.printf("Las soluciones a la ecuación %s son: \n", ecuacion); 
            System.out.printf("El resultado de x = %.2f \n", ((double)(-b)+Math.sqrt(raiz))/(double)2*a);
            System.out.printf("El resultado de x = %.2f \n",  ((double)(-b)-Math.sqrt(raiz))/(double)2*a);
            }else 
            System.out.print("La ecuación no tiene resultado, vuelva a decir los datos");

        sc.close();

    } 
}
