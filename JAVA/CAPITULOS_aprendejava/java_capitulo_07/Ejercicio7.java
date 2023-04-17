/**
 * 7 Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del primer
 * valor por el segundo en la lista generada anteriormente. Los números que se
 * han cambiado deben aparecer entrecomillados.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] numeros = new int [100];
        for(int i = 0; i<100;i++){
            numeros [i] = (int)(Math.random()*21);
            System.out.print(numeros [i]+ " ");
        }

        System.out.println("");
        System.out.print("Dime el número que quieres cambiar: ");
        int cambiar = sc.nextInt();
        System.out.print("Dime el número a cambiar: ");
        int cambiado = sc.nextInt();
        System.out.println("");

        for(int i = 0; i<100;i++){
            if(numeros[i]==cambiar){
                numeros[i] = cambiado;
                System.out.print("\"" + numeros[i] + "\" ");
            }
            System.out.print(numeros[i] + " ");
        }
        sc.close();
    }
}
