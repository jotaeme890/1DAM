/**
 * 9 Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 * 
 * @author jotaeme
 */



public class Ejercicio9 {
    public static void main(String[] args) {
            int cont = 0;
            int numero = 0;

            do {
                numero = (int)(Math.random()*101);
                cont++;
                System.out.print(numero + " ");
            } while (numero != 24);
            System.out.println();
            System.out.print("Se han generado: " + cont + " números");
    }
}
