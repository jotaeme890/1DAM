/**
 * 1 Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 * @author jotaeme
 */

public class Ejercicio1 {
    public static void main(String args []) {
        int suma = 0;

        for (int i = 1; i<=3 ; i++){
            int tirada = (int)(Math.random()*6+1);
            System.out.println("El total de la tirada ha sido: " + tirada);
            suma += tirada;
        }
        System.out.println("La suma total es: " + suma);
    }
}