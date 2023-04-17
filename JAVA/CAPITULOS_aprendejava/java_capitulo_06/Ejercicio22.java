/**
 * 22 Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
 * el cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o una
 * posición a la derecha del anterior. La longitud de la serpiente se pedirá por
 * teclado y se supone que el usuario introducirá un dato correcto.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la altura: ");
        int altura = sc.nextInt();
        int espacios= 12;
        System.out.println("            @");


        for(int i = 1; i<=altura-1 ; i++){
            int numeroposicion = (int)(Math.random()*3+1);
            String posicion = "";

            switch (numeroposicion) {
                case 1:
                    espacios--;
                    for(int b = 1; b<=espacios;b++){
                        System.out.print(" ");
                    }
                    posicion ="*";
                break;
                
                case 2:
                for(int b = 1; b<=espacios;b++){
                    System.out.print(" ");
                }
                    posicion ="*";
                break;

                case 3:
                espacios++;
                for(int b = 1; b<=espacios;b++){
                    System.out.print(" ");
                }
                    posicion ="*";
                break;
            }   

            System.out.print(posicion);
            System.out.println();
        }

        sc.close();
    }
}
