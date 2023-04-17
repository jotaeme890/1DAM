/**
 * 21 Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int cont=0;
        int num;
        int sumai = 0;
        int nump = 0;

        do {
            System.out.print("Dime un número: ");
            num = sc.nextInt();

            if(num<1){
                System.out.println("ERROR!");
            } else{
                if(num%2!=0){
                sumai= num + sumai;
                cont ++;
                } else{
                    if(num>nump){
                        nump = num;
                    }
                }
                
            } 
        } while (num>0);
            System.out.println("La media de los impares es: " + sumai/cont);
            System.out.println("El valor par más alto es: " + nump);
            
    sc.close();
    }
}
