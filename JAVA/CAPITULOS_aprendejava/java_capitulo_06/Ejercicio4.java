/**
 * 4 Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 * 
 * @author jotaeme
 */



public class Ejercicio4 {
    public static void main (String args []){
        for (int i = 0 ; i < 20 ; i++){
            int numeros = (int)(Math.random()*11);
            System.out.print(numeros + " ");
        }
    }
}
