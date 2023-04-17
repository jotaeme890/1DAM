/**
 * 18 Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
 * debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
 * naranja.
 * 
 * @author jotaeme
 */



public class Ejercicio18 {
    public static void main(String[] args) {
        
        String color = "";
        int uno, dos,tres;

        do {
            uno = (int)(Math.random()*6+1);
            dos = (int)(Math.random()*6+1);
            tres = (int)(Math.random()*6+1);

        } while (uno==dos || dos==tres || uno==tres);
            switch (uno) {
                case 1:
                    color = "\u001B[31m*****\n*   *\n*****";
                break;
                case 2:
                    color = "\u001B[34m*****\n*   *\n*****";
                break;
                case 3:
                    color = "\u001B[32m*****\n*   *\n*****";
                break;
                case 4:
                    color = "\u001B[33m*****\n*   *\n*****";
                break;
                case 5:
                    color = "\u001B[35m*****\n*   *\n*****";
                break;
                case 6:
                    color = "\033[33m*****\n*   *\n*****";
                break;
            }
                System.out.println(color);

            switch (dos) {
                case 1:
                    color = "\u001B[31m*****\n*   *\n*****";
                break;
                case 2:
                    color = "\u001B[34m*****\n*   *\n*****";
                break;
                case 3:
                    color = "\u001B[32m*****\n*   *\n*****";
                break;
                case 4:
                    color = "\u001B[33m*****\n*   *\n*****";
                break;
                case 5:
                    color = "\u001B[35m*****\n*   *\n*****";
                break;
                case 6:
                    color = "\033[33m*****\n*   *\n*****";
                break;
            }
                System.out.println(color);

            switch (tres) {
                case 1:
                    color = "\u001B[31m*****\n*   *\n*****";
                break;
                case 2:
                    color = "\u001B[34m*****\n*   *\n*****";
                break;
                case 3:
                    color = "\u001B[32m*****\n*   *\n*****";
                break;
                case 4:
                    color = "\u001B[33m*****\n*   *\n*****";
                break;
                case 5:
                    color = "\u001B[35m*****\n*   *\n*****";
                break;
                case 6:
                    color = "\033[33m*****\n*   *\n*****";
                break;
            }
            System.out.println(color);
    }
}
