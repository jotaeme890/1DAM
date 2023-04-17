/**
 * 34 Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando los
 * dígitos de la siguiente manera: primer dígito del primer número, primer dígito
 * del segundo número, segundo dígito del primer número, segundo dígito del
 * segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
 * podemos suponer que el usuario introducirá dos números de la misma longitud
 * y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
 * int donde sea necesario para admitir números largos.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio34 { 
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        long n1 = sc.nextLong();
        System.out.print("Dime otro número: ");
        long n2 = sc.nextLong();

        long n = n1;
        long m = n2;
        long mezcla = 0;
        long pares = 0;
        long impares = 0;
        int v = 0;

        while(n!=0){
            v = (int)(n%10); //le hacemos un casting ya que tenemos que pasar el long a un numero pequeño y cogemos el ultimo numero
            mezcla = mezcla * 10 + v; //juntamos los 2 números
            if (v%2==0){
                pares ++; //contador de pares para despues sacar los números pares
            } else {
                impares ++; //contador de impares para despues sacar los números impares
            }

            v = (int)(m%10); //le hacemos un casting ya que tenemos que pasar el long a un numero pequeño y cogemos el ultimo dígito
            mezcla = mezcla * 10 + v; //juntamos los 2 números
            if (v%2==0){
                pares ++; //contador de pares para despues sacar los números pares
            } else {
                impares ++; //contador de impares para despues sacar los números impares
            }

            n = n/10; //para quitarle el ultimo digito al numero
            m = m/10; //para quitarle el ultimo digito al numero
        }

        int cont = 1;
        long valores = pares+impares;
        long npar = 0;
        long nimpar = 0;
        int contpares = 1;
        int contimpares = 1;

        while (cont <= valores){
            v = (int)(mezcla %  10);

            if (v%2 == 0){
                npar = npar + (long)(v * Math.pow(10,pares-contpares));
                contpares++;
            } else{
                nimpar = nimpar + (long)(v * Math.pow(10,impares-contimpares));
                contimpares++;
            }

            mezcla = mezcla / 10;
            cont ++;
        }
        System.out.printf("El número formado por los pares es: %d \n", npar);
        System.out.printf("El número formado por los impares es: %d \n", nimpar);
        sc.close();
    } 
}
