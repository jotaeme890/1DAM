/**
 * 24 Escribe un programa que, dado un número introducido por teclado, elija al azar
 * uno de sus dígitos.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int numero = sc.nextInt();
        int cont = 0;
        int aux = numero;

        while(numero>0){
            numero /=10;
            cont++;
        }

        int numero2 = (int)(Math.random()*cont+1);

        for(int i = 1; i<=cont ; i++){
            if(i==numero2){
                System.out.println(aux%10);
            } else if (i!=numero2){
                aux/=10;
            }
        }
        sc.close();
    }
}
