/**
 * 16 Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
 * perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 * ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 * 
 * @author jotaeme
 */



public class Ejercicio16 {
    public static void main(String[] args) {
        int valor;
        int valor1 = 0;
        int valor2 = 0;
        int valor3 = 0;
        for(int contador = 1; contador <= 3 ; contador ++){
            valor = (int)(Math.random()*5+1);
            switch (valor) {
                case 1:
                    System.out.print(" Corazón | ");
                break;
                case 2:
                    System.out.print(" Diamante | ");
                break;
                case 3:
                    System.out.print(" Herradura | ");
                break;
                case 4:
                    System.out.print(" Campana | ");
                break;
                case 5:
                    System.out.print(" Limón | ");
                break;
            }

            switch (contador) {
                case 1:
                    valor1 = valor;
                break;
                case 2:
                    valor2 = valor;
                break;
                case 3:
                    valor3 = valor;
                break;
            }
        }
        System.out.println("");
        if(valor1 != valor2 && valor1 != valor3 && valor2 != valor3){
            System.out.println(" -> Has perdido");
        } else if(valor1 == valor2 && valor1 == valor3 && valor2 == valor3){
            System.out.println(" -> Has ganado 10 monedas");
        } else if(valor1 == valor2 || valor1 == valor3 || valor2 == valor3){
            System.out.println(" -> Has recuperado la moneda");
        }
    }
}
