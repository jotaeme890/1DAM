/**
 * 10 Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
 * de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
 * entre 1 y 40 caracteres.
 * 
 * @author jotaeme
 */



public class Ejercicio10 {
    public static void main(String[] args) {
        int longitud = 0;
        int caracteres;
        
        for ( int i = 1 ; i <= 10; i++){
            longitud = (int)(Math.random()*41);
            caracteres = (int)(Math.random()*6+1);
            for(int b = 1 ; b<=longitud; b++){
                switch (caracteres) {
                    case 1:
                    System.out.print("*");
                    break;
                    case 2:
                    System.out.print("-");
                    break;
                    case 3:
                    System.out.print("=");
                    break;
                    case 4:
                    System.out.print(".");
                    break;
                    case 5:
                    System.out.print("|");
                    break;
                    case 6:
                    System.out.print("@");
                    break;
                }
            }
            System.out.println();
        }
    }
}
