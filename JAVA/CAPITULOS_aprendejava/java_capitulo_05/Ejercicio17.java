/**
 * 17 Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 * 
 * @author jotaeme
 */
    

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        int suma = 0;
        
        if (n<0){
            System.out.println("ERROR!");
        } else{
            for (int i = n ; i<n+100 ; i++){
                suma = i +suma;
            } 
            System.out.println("La suma sería: " + suma);
        }
        sc.close();
    }
}
