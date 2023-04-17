/**
 * 7 Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. 
 * El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje 
 * “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. 
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        
        
        int intentos = 4;
        boolean salir = false;
        int cont = 1234;

        do {
            System.out.println("Porfavor, dime la contraseña: ");
            int pass = sc.nextInt();
            if(pass==cont){
                salir = true;
            } else{
                System.out.println("Esa no es la contraseña, introduzcala de nuevo: ");
            }

            intentos --;

        } while ((intentos >0) && (!salir));
            if(salir){
                System.out.println("Contraseña correcta, bienvenido");
            } else 
                System.out.println("Has gastado todas las oportunidades, lo siento");
    sc.close();
    }
}