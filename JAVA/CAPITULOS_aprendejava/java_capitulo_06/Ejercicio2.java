/**
 * 2 Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
 * y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
 * numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
 * 1). Para convertir un número en una cadena de caracteres podemos usar
 * String.valueOf(n).
 * 
 * @author jotaeme
 */



public class Ejercicio2 {
    public static void main (String args []){
        int carta = (int)(Math.random()*13+1);
        String carta2;

        switch (carta) {
            case 1:
                carta2 = "As";
            break;
            case 11:
                carta2 ="J";
            break;
            case 12:
                carta2 ="Q";
            break;
            case 13:
                carta2 ="K";
            break;
        
            default:
            carta2 =  String.valueOf(carta);
            break;
        }

        int palo = (int)(Math.random()*4+1);
        String palo2 = "";

        switch (palo) {
            case 1:
                palo2 = "Picas";
            break;
            case 2:
                palo2 = "Corazones";
            break;
            case 3:
                palo2 = "Diamantes";
            break;
            case 4:
                palo2 = "Tréboles";
            break;
        }
        System.out.println(carta2 + " de "+ palo2);
    }
}
