/**
 * 13 Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 * 
 * @author jotaeme
 */



public class Ejercicio13 {
    public static void main(String[] args) {
        int tirada1 = 0;
        int tirada2 = 0;

        do {
            tirada1 = (int)(Math.random()*6+1);
            tirada2 = (int)(Math.random()*6+1);
            System.out.println("Dado 1: " + tirada1 + "   |   Dado 2: " + tirada2);
        } while (tirada1 != tirada2);
    }
}
