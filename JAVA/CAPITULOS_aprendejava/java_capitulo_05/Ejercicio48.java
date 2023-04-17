/**
 * 48 Realiza un programa que diga los dígitos que aparecen y los que no aparecen
 * en un número entero introducido por teclado. El orden es el que se muestra en
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
 * largos.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio48{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número: ");
        long numero = sc.nextLong();

        long aux;
        aux=numero;
        boolean salir = true;

        System.out.print("Los dígitos que hay en ese número son: ");
        for(int i = 0; i<10; i++){
            salir=true;
            aux=numero;
            while(aux>0 && salir){
                if(i == aux%10){ //si i, que empieza valiendo 0 es igual al último del dígito que sale, sale del bucle y lo pinta ya que aparece en el número
                    salir=false;
                }
                aux/=10;
            }
            if(!salir){
                System.out.print(i + " ");
            }
        }

        System.out.println("");

        System.out.print("Los dígitos que no hay en ese número son: ");
        for(int i = 0; i<10; i++){
            salir=true;
            aux=numero;
            while(aux>0 && salir){
                if(i == aux%10){
                    salir=false;
                }
                aux/=10;
            }
            if(salir){
                System.out.print(i + " ");
            }
        }
        
        sc.close();
    }
}