/**
 * 45 Escribe un programa que cambie un dígito dentro de un número dando la
 * posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
 * empezando por el 1. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos. Suponemos que el usuario introduce
 * correctamente los datos.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int numero = sc.nextInt();
        System.out.print("Dime donde quieres partir: ");
        int partir = sc.nextInt();
        System.out.print("Dime el numero que quieres añadir: ");
        int numero2 = sc.nextInt();

        long aux =numero;
        int cont = 1;
        long auxiliar = 0;

        while (aux >= 10) {
            aux = aux/10;
            cont++;
        }

        if(partir > cont){
            System.out.println("Dime bien los valores");
        } else if(partir == cont){
            System.out.println("Dime bien los valores");
        }  else if (partir < cont){
            for(int i = 0 ; i < cont-partir ; i++){
                auxiliar += (int)(numero%10)*Math.pow(10,i);
                numero /= 10;
            }

            numero /= 10;
            
            System.out.print("El número sería: "+ "" + numero + numero2 + auxiliar);

        }
        sc.close();
    }
}

