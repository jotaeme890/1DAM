/**
 * 12 Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
 * números están entre 0 y 9. El programa deberá colocar el número de la posición
 * inicial en la posición final, rotando el resto de números para que no se pierda
 * ninguno. Al final se debe mostrar el array resultante.
 *  
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] num = new int [10];
        int auxinicio = 0;
        int auxfinal = 0;

        for(int i = 0; i <10 ; i++){ //Creamos el array con los valores que nos dan
            System.out.print("Dime un número para el array: ");
            num [i] = sc.nextInt();
        }

        System.out.println("");
        System.out.println("El array inicial sería: "); //Mostramos el array sin modificar
        System.out.print("Índice");
        for(int i = 0; i <10 ; i++){
            System.out.printf("%7s" , i);
        }
        System.out.println("");
        System.out.print("Valor ");
        for(int i = 0; i <num.length ; i++){
            System.out.printf("%7s" , num[i]);
        }

        do {
            System.out.println("");
            System.out.print("Dime la posición inicial: ");
            auxinicio = sc.nextInt();
            System.out.print("Dime la posición final: ");
            auxfinal = sc.nextInt();
        } while (auxfinal < auxinicio && auxfinal < 9 && auxfinal > 0 && auxinicio > 0 && auxinicio < 9);

        System.out.println("");

        System.out.println("El array modificado sería: "); //Mostramos el array modificado
        System.out.print("Índice");

        for(int i = 0; i <10 ; i++){
            System.out.printf("%7s" , i);
        }        System.out.println("");
        System.out.print("Valor ");

        int auxinicial = num[auxinicio]; //Guardamos el contenido de la posición que dice el usuario dentro de una variable para que no se borre su valor
        for(int i = auxinicio ; i > 0 ; i--){ //Rotamos el array de derecha a izquierda, del máximo numero del array al 0 que es el ultimo
            num[i] = num[i-1]; //Rotamos el array de derecha a izquierda, es decir el valor de la derecha se guarda en el de la izquierda
        }
        num[0] = num[num.length-1]; //Le damos al primer índice del array el valor del último, y así no entra 

        for(int i = num.length-1; i > auxfinal ; i--){ //Contamos el array desde la última posición hasta el número final, para ello contaremos sus índices
            num[i] = num[i-1]; //Rotamos el array de derecha a izquierda, es decir el valor de la derecha se guarda en el dde la izquierda
        }

        num[auxfinal] = auxinicial;
        for(int i = 0; i <num.length ; i++){
            System.out.printf("%7s" , num[i]);
        }
        sc.close();
    }   
}
