/**
 * 63 Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos,
 * una al lado de la otra y separadas por un espacio en su base.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio63{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print("Dime la altura de la primera piramide: ");
        int altura1=sc.nextInt();
        System.out.print("Dime la altura de la segunda piramide: ");
        int altura2=sc.nextInt();
        int posicion=0;

        if(altura1>altura2){
            posicion=1;
        }
        if(altura1<altura2){
            posicion=2;
        }
        if(altura1==altura2){
            posicion=3;
        }

        switch(posicion){
            case 1:

            int diferencia=altura1-altura2;

                for(int i=1;i<=altura1;i++){

                    for(int b=1;b<=altura1-i;b++){
                        System.out.print(" ");
                    }
                    for(int b=1;b<=i*2-1;b++){
                        System.out.print("*");
                    }

                    if(i>diferencia){

                        for(int b=1;b<=altura1-i;b++){
                            System.out.print(" ");
                        }
                        for(int b=1;b<=altura2-i+diferencia+1;b++){
                            System.out.print(" ");
                        }
                        for(int b=1;b<=(i-diferencia)*2-1;b++){
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }

            break;
            case 2:
            int diferencia2=altura2-altura1;
            int altura_reflejo=altura2;
                for(int i=1;i<=altura2;i++){

                    if(i<=altura2-altura1){
                        for(int b=1;b<altura1*2-1+(altura_reflejo*2)/2+1;b++){
                            System.out.print(" ");
                        }
                        for(int b=1;b<=i*2-1;b++){
                            System.out.print("*");
                        }
                        System.out.println("");
                        altura_reflejo--;
                    }else{
                        for(int b=1;b<=altura1-i+diferencia2;b++){
                            System.out.print(" ");
                        }
                        for(int b=1;b<=(i-diferencia2)*2-1;b++){
                            System.out.print("*");
                        }
                        for(int b=1;b<=altura1-i+diferencia2+1;b++){
                            System.out.print(" ");
                        }
                        for(int b=1;b<=altura1-i+diferencia2;b++){
                            System.out.print(" ");
                        }
                        for(int b=1;b<=i*2-1;b++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
            break;

            case 3:
                for(int i=1;i<=altura1;i++){
                    for(int b=1;b<=altura1-i;b++){
                        System.out.print(" ");
                    }
                    for(int b=1;b<=i*2-1;b++){
                        System.out.print("*");

                    }
                    for(int b=1;b<=altura1-i;b++){
                        System.out.print(" ");
                    }
                    for(int b=1;b<=altura1-i;b++){
                        System.out.print(" ");
                    }

                    System.out.print(" ");//para separarlas

                    for(int b=1;b<=i*2-1;b++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            break;
        }
        sc.close();
        }
}

