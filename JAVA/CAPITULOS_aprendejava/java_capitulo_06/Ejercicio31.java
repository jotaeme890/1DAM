/**
 * 31 Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
 * partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
 * muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
 * 11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
 * si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
 * suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
 * da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
 * entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
 * ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
 * pierde. Si sale otro número, tiene que seguir tirando.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la cantidad de dinero a apostar: ");
        int apuesta = sc.nextInt();
        boolean salir = false;

        int tiradadado1 = 0;
        int tiradadado2 = 0;
        int suma = 0;
        
        for(int i = 1 ; i < 2 ; i++){
            tiradadado1= (int)(Math.random()*6+1);
            tiradadado2= (int)(Math.random()*6+1);
            suma = tiradadado1 + tiradadado2;
        }
        System.out.println("La suma de los dados " + "" + tiradadado1 + ", " + tiradadado2 + " ha sido " + suma);
        if(suma == 11 || suma == 7){
            System.out.println( "Has ganado un total de " + apuesta + " euros");
        } else if (suma ==2 || suma==3 || suma==12){
            System.out.println("Lo siento has perdido");
        } else {
            System.out.println("Has entrado en la segunda etapa del juego, vamos a tirar de nuevo los dados, tiene que obtener la suma de " + suma + ", recuerde si saca un 7 pierde");
            do {
                salir=false;
                for(int i = 1 ; i < 2 ; i++){
                    tiradadado1= (int)(Math.random()*6+1);
                    tiradadado2= (int)(Math.random()*6+1);
                }
                int sumanueva = tiradadado1+tiradadado2;
                System.out.println("La suma de los dados " + "" + tiradadado1 + ", " + tiradadado2 + " ha sido " + sumanueva);

                if(sumanueva==suma){
                    System.out.println("Has ganado un total de " + apuesta + " euros");
                    salir = true;
                } else if (sumanueva==7){
                    System.out.println("Lo siento has perdido");
                    salir = true;
                }  else {
                    System.out.println("Continua en el juego");
                }

            } while (!salir);
        }
        sc.close();
    }
}
