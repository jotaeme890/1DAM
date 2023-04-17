/**
 * 65 Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir
 * la altura total y la fila en la que debe aparecer el palito horizontal (contando
 * desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito
 * horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario
 * introduce algún dato incorrecto, el programa debe mostrar un mensaje de error.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la altura: ");
        int n = sc.nextInt();
        System.out.print("Dime la altura a la que quieres el palo horizontal: ");
        int h = sc.nextInt();
        
        if(n < 3){
            System.out.println("Dime bien los valores");
        } else if(h > n){
            System.out.println("Dime bien los valores");
        } else if (h <1 ){
            System.out.println("Dime bien los valores");
        } else{
            for (int i=1; i<=n ; i++){

                if (i == h){
                    for(int espacios=n-i ; espacios>0 ; espacios--)
                    System.out.print(" ");
        
                    for (int asteriscos=1; asteriscos<=((2*i)-1); asteriscos++){
                        System.out.print("*");
                    }
                    System.out.println("");
                } else{
                    for(int espacios=n-i ; espacios>0 ; espacios--)
                    System.out.print(" ");
        
                    System.out.print("*");
        
                    for (int asteriscos=1; asteriscos<=((2*i)-1)-2; asteriscos++){
                        System.out.print(" ");
                    }
        
                        if(i!=1){
                        System.out.print("*");
                    }
                        System.out.println("");
                }
            }
        }
    sc.close();
    }
}
