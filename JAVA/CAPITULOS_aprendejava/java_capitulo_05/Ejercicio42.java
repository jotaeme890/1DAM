/**
 * 42 Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los 5 números consecutivos a partir del número
 * introducido. Al lado de cada número se debe indicar si se trata de un primo
 * o no
 * 
 *  @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int numero = sc.nextInt();
        boolean primo;

        for(int i=1;i<=5;i++){
            primo=true;
            for(int b=2; b<numero-1 && primo;b++){
                if(numero%b==0){
                    primo=false;
                }else{
                    primo=true;
                }
            }
            if(primo){
                System.out.println(numero+" ES PRIMO");
            }else{
                System.out.println(numero+" NO ES PRIMO");
            }
            numero++;
        }
        sc.close();
    }
}
