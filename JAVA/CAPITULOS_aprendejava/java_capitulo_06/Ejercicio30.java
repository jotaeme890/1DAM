/**
 * 30 El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
 * Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
 * le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera
 * con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. Por
 * una cuestión de física elemental, ninguno de los animales puede coincidir
 * en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera,
 * que como mínimo serán de 4 unidades.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la altura de la pecera (mínimo 4): ");
        int altura = sc.nextInt();
        System.out.print("Dime el ancho de la pecera (mínimo 4): ");
        int ancho = sc.nextInt();

        int pez = 0;
        int posicion = 0;
        int caballito = 0;
        int caracola = 0;

        do {
            pez = (int)(Math.random()*(ancho-2)*(altura-2));
            caballito = (int)(Math.random()*(ancho-2)*(altura-2));
            caracola = (int)(Math.random()*(ancho-2)*(altura-2));

        } while (pez == caballito && pez==caracola && caballito == caracola);

        for(int alt = 1 ; alt < altura ; alt++){//alto de la pecera
            for(int anch = 1; anch < ancho ; anch++){ //ancho de la pecera con los espacios interiores
                if(anch == 1){ //primera X
                    System.out.print("X");
                }
                if(pez == posicion){ //si la posicion es igual a la cuenta del random, se imprime el pececito, en este caso al empezar en 0, se va a incrementar hasta que sea el mismo valor para imrpimir o los espacios o el pececito (tiene que hacer alguna de ellas)
                    System.out.print("~");
                } else if (caballito == posicion){
                        System.out.print("$");
                    } else if(caracola == posicion){
                            System.out.print("@");
                        } else{
                            System.out.print(" ");
                        }
                posicion++;
            }
            System.out.print("X");
            System.out.println("");

            if(alt==altura-1){
                for(int anch = 1 ; anch<=ancho ; anch++){
                    if(anch == 1){
                        System.out.print("\\");
                    } else if(anch == ancho){
                        System.out.print("/");
                    } else{
                        System.out.print("X");
                    }
                }
            }
        }
        sc.close();
    }
}