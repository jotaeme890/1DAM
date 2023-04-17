/**
 * 23 Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
 * Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 * 
 * @author jotaeme
 */



public class Ejercicio23 {
    public static void main(String[] args) {
        for(int i = 1; i<= 5; i++){
            int numerodado = (int)(Math.random()*6+1);
            String dado = "";

            switch (numerodado) {
                case 1:
                    dado = "As";
                break;
                case 2:
                    dado = "K";
                break;
                case 3:
                    dado = "Q";
                break;
                case 4:
                    dado = "J";
                break;
                case 5:
                    dado = "7";
                break;
                case 6:
                    dado = "8";
                break;
            }
            System.out.print(dado + " ");
        }
    }
}
