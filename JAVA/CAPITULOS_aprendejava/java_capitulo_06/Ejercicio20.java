/**
 * 20 Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime los litros que caben en la cuba (mínimo 0): ");
        int altura = sc.nextInt();

        int agua = (int)(Math.random()*(altura-1));
        int posicion = 0;

        for(int i = 1; i<=altura ; i++){
                System.out.print("*");

                if(posicion >= agua){ //ya que empieza en cuando sea el primer nivel de agua, y para hacer lo inferior hay que hacerlo mientras sea mayor ya que la linea desciendda, aumenta el nivel
                    System.out.print("~~~~~~~~~");
                } else {
                    System.out.print("         ");
                    
                }
                posicion++; //haria lo mismo que con el pez
                System.out.print("*");
                System.out.println();

        }
        for(int ultimo = 1; ultimo <= 6;ultimo++){
            System.out.print("* ");
        }
        sc.close();
    }
}

