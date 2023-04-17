/**
 * 26 Realiza un programa que pinte una tableta de turrón con un bocado realizado de
 * forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
 * da alrededor del turrón, obviamente no se puede dar un bocado por en medio
 * de la tableta.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la altura de la tableta: ");
        int altura = sc.nextInt();
        System.out.print("Dime el ancho de la tableta: ");
        int ancho = sc.nextInt();

        int numbocado= (int)(Math.random()*4+1);
        int numero = 0;

        switch (numbocado) {
            case 1:
                numero = (int)(Math.random()*ancho);

                for(int i = 1; i <= altura; i++){
                    for(int b = 1; b <=ancho;b++){
                            if (b==numero && i==1){
                                System.out.print(" ");
                            } else{
                                System.out.print("*");
                            }
                        }
                    System.out.println();
                }
            break;

            case 2:
                numero = (int)(Math.random()*altura);
                for(int i = 1; i <= altura; i++){
                    for(int b = 1; b <=ancho;b++){
                            if (i==numero && b==1){
                                System.out.print(" ");
                            } else{
                                System.out.print("*");
                            }
                                
                        }
                    System.out.println();
                }
            break;

            case 3:
            numero = (int)(Math.random()*ancho);
                for(int i = 1; i <= altura; i++){
                for(int b = 1; b <=ancho;b++){
                        if (b==numero && i==altura){
                            System.out.print(" ");
                        } else{
                            System.out.print("*");
                        }
                            
                    }
                System.out.println();
                }
            break;

            case 4:
                numero = (int)(Math.random()*altura);
                for(int i = 1; i <= altura; i++){
                    for(int b = 1; b <=ancho;b++){
                            if (i==numero && b==ancho){
                                System.out.print(" ");
                            } else{
                                System.out.print("*");
                            }
                                
                        }
                    System.out.println();
                }
            break;
        }
        sc.close();
    }
}
