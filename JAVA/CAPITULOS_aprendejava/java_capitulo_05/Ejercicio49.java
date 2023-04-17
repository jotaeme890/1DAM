/**
 * 49 Realiza un programa que calcule el máximo, el mínimo y la media de una serie
 * de números enteros positivos introducidos por teclado. El programa terminará
 * cuando el usuario introduzca un número primo. Este último número no se
 * tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
 * números ha introducido el usuario (sin contar el primo que sirve para salir).
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        int numero = 0;
        int maximo = 0;
        int minimo = 2147483647;
        double suma = 0;
        boolean esprimo = false;
        int contador = 0;

        while (!esprimo){
            System.out.print("Dime un número: ");
            numero = sc.nextInt();
            esprimo = true;
            for(int i = 2; i <= numero/2 ; i++){ //comprobamos si el número es primo
                if ((numero % i) == 0) { 
                    esprimo = false;
                }
            }
            
            if (numero==1 || !esprimo){ //al dar error con el 1 por que lo detecta como primo y no lo es, lo tendremos en cuenta
                contador ++;
                if(numero==1){
                    esprimo = false;
                }
                if (numero<minimo){
                    minimo=numero;
                }
                if (numero>maximo){
                    maximo=numero;
                }
                suma+=numero;
            }
        }   

        if(contador!=0){
            double media = suma/contador;
            System.out.println("Ha introducido "+ contador + " números no primos \n" + "El máximo: " + maximo + "\nEl mínimo: " + minimo + "\nLa media: " + media );
            sc.close();
        } else{
            System.out.print("Dime bien los valores");
        }
    }
}

