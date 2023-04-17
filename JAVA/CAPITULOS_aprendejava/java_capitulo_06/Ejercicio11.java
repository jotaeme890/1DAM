/**
 * 11 Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 * 
 * @author jotaeme
 */



public class Ejercicio11 {
    public static void main(String[] args) {
        int notas = 0;
        int contn = 0;
        int contb = 0;
        int contsu = 0;
        int contso = 0;
        int contsus = 0;

        for(int i = 1 ;i <= 20 ; i++){
            notas = (int)(Math.random()*11);
            switch (notas) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("La nota " + notas + " es suspenso");
                    System.out.println();
                    contsus ++;
                break;
                case 5:
                    System.out.println("La nota " + notas + " es suficiente");
                    System.out.println();
                    contsu ++;
                break;
                case 6:
                    System.out.println("La nota " + notas + " es bien");
                    System.out.println();
                    contb ++;
                break;
                case 7:
                case 8:
                    System.out.println("La nota " + notas + " es notable");
                    System.out.println();
                    contn ++;
                break;
                case 9:
                case 10:
                    System.out.println("La nota " + notas + " es sobresaliente");
                    System.out.println();
                    contso ++;
                break;
            }
        }
        System.out.println("El total de suspensos, ha sido, " + contsus);
        System.out.println("El total de suficientes, ha sido, " + contsu);
        System.out.println("El total de bien, ha sido, " + contb);
        System.out.println("El total de notables, ha sido, " + contn);
        System.out.println("El total de sobresalientes, ha sido, " + contso);
    }
}
