/**
 * 27 Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
 * jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
 * introduce una opción incorrecta, el programa deberá mostrar un mensaje de
 * error.
 * 
 * @author jotaeme
 */


import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Que quieres jugar? Piedra , Papel o Tijera : ");
        String elegido = sc.next();
        int n = 0;

        elegido = elegido.toLowerCase();

        switch (elegido) {
            case "piedra":
                n=1;
            break;
            case "papel":
                n=2;
            break;
            case "tijera":
                n=3;
            break;
        }

        if(n!=1 && n!=2 && n!=3){
            System.out.println("Dime bien los valores");
        }

        int numeroelegido = (int)(Math.random()*3+1);
        int n2 = 0;
        switch (numeroelegido) {
            case 1:
                n2=1;
            break;
            case 2:
                n2=2;
            break;
            case 3:
                n2=3;
            break;
        }
        //ganar
        if(n==1 && n2 ==3){ 
            System.out.println("Enhorabuena, has ganado");
        } else if(n==2 && n2==1){
            System.out.println("Enhorabuena, has ganado");
        } else if(n==3 && n2==2){
            System.out.println("Enhorabuena, has ganado");
        }
        //empate
        if(n==n2){
            System.out.println("Has empatado");
        }
        //perder
        if(n==3 && n2 ==1){ 
            System.out.println("Has perdido");
        } else if(n==1 && n2==2){
            System.out.println("Enhorabuena, has ganado");
        } else if(n==2 && n2==3){
            System.out.println("Enhorabuena, has ganado");
        }
        sc.close();
    }
}