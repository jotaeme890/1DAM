/**
 * 68 scribe un programa que pida un número por teclado y que luego lo “disloque” de 
 * tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
 * es impar. Usa long en lugar de int donde sea necesario para admitir números
 * largos.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número: ");
        long numero = sc.nextLong();

        long auxNumero = numero;
        long numeroReves = 0;
        long numeroreves = 0;
        long digito = 0;

        while (numero > 0) { //dar la vuelta al número
            numeroReves = ((numeroReves * 10) + (numero % 10));
            numero /= 10;
        }

        while (numeroReves > 0) {
            if (numeroReves % 2 == 0) {
                digito = ((numeroReves % 10) + 1);
                numeroreves = ((numeroreves * 10) + digito);
            } else {
                digito = ((numeroReves % 10) - 1);
                numeroreves = ((numeroreves * 10) + digito);
            }
            numeroReves /= 10;
        }
        System.out.println("El resultado del número " + auxNumero + " sería " + numeroreves);
        sc.close();
    } 
}

