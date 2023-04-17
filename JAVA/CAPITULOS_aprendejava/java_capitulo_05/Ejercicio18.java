/**
 * 18 Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 * 
 * @author jotaeme
 */
    

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.print("Dime otro número: ");
        int n2 = sc.nextInt();
        
        if(n==n2){
            System.out.println("ERROR!, tienen que ser distintos");
        } 

        for(int i = n; i<=n2; i +=7)
        System.out.println("Los números serian: " + i);
        sc.close();
    }
}
