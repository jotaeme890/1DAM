/**
 * 64 Escribe un programa que pinte por pantalla un rectángulo hueco de 6 caracteres de ancho por 3 de alto y, 
 * a continuación, un menú que permita agrandarlo,
 * achicarlo o cambiar su orientación. Cada vez que el rectángulo se agranda,
 * se incrementa en 1 tanto su anchura como su altura. Cuando se achica,
 * se decrementa en 1 su anchura y altura. Por último, cuando se cambia la
 * orientación, los valores de anchura y altura se intercambian. El valor mínimo
 * de la altura o la anchura es 2.
 *
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio64 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        
        boolean salir = true;
        int tamaño = 1;
                for (int i = 1; i <= 6; i++) {
                    System.out.print("*");
                }
                for (int i = 2; i < 3; i ++) {
                    System.out.print("\n*");
                    for (int espacios = 2; espacios < 6; espacios++) {
                    System.out.print(" ");
                    }
                    System.out.print("*");
                    }
                    System.out.println();
                    for (int i = 1; i <= 6; i++) {
                    System.out.print("*");
                    }
                    System.out.println("");
                    
            do {
                System.out.println("");
                System.out.print("¿Qué quieres hacer? 1)Agrandar 2)Disminuir 3)Voltear 4)Salir: ");
                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        tamaño++;
                        System.out.print("******");
                        System.out.println("");
                        for(int i = 1;i<=tamaño;i++){
                            System.out.println("*    *");
                        }
                        System.out.print("******");
                    break;
                
                    case 2:
                        tamaño--;
                        System.out.print("******");
                        System.out.println("");
                        for(int i = 1;i<=tamaño;i++){
                            System.out.println("*    *");
                        }
                        System.out.print("******");
                    break;

                    case 3:
                        for(int i=1;i<=6;i++){
                            System.out.print("*");
                            for(int b=1; b<=tamaño ;b++){
                                if(i==1 || i==6){
                                        System.out.print("*");
                                    }else{
                                        System.out.print(" ");
                                    }
                                }
                            System.out.println("*");
                        }
                    break;

                    case 4:
                        salir=false;
                    break;
                }

            } while (salir);
            sc.close();
        }
    }

