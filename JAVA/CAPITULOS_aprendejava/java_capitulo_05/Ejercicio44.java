/**
 * 44 Escribe un programa que sea capaz de insertar un dígito dentro de un número
 * indicando la posición. El nuevo dígito se colocará en la posición indicada y el
 * resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
 * izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
 * correctamente los datos. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio44 {
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

            System.out.print("El número sería: "+ "" + numero + numero2 + auxiliar);

        }
        sc.close();
    }
}