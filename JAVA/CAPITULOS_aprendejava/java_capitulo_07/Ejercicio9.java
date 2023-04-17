/**
 * 9 Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int [8];

        
        for(int i = 0; i<8;i++){
            System.out.print("Dime un número: ");
            num [i] = sc.nextInt();
        }

        for(int i=0;i<8;i++){
            if(num[i]%2==0){
                System.out.println(num[i]+ " PAR");
            }else{
                System.out.println(num[i]+ " IMPAR");
            }
        }
        sc.close();
    }
}
