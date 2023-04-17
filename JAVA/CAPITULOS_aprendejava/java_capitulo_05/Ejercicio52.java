/**
 * 52 Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
 * dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
 * queda igual.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        long numero = sc.nextLong();

        long aux =numero;
        long contador= 0;

        while (aux > 0) { //contamos los digitos
            aux /= 10;
            contador++;
        }

        long digito = (int)(numero / Math.pow(10,contador-1)); // sacamos el primer número para moverlo a la derecha (1234, cogeria el 1)
        int  resto = (int)(numero % Math.pow(10,contador-1)); // sacamos el resto del número (1234, cogeria el 234)

        System.out.printf("El número resultado es %d" , resto*10+digito); // tenemos el resto el cual lo multiplicamos por 10 para que al sumarle el primero esté bien
        sc.close();
    }
}