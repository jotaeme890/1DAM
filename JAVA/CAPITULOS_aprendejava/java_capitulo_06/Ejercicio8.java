/**
 * 8 Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
 * 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 * 
 * @author jotaeme
 */



public class Ejercicio8 {
    public static void main(String[] args) {
        int fila = 14;
        int numeroquiniela = 0;
        int columna = 3;

        for(int i = 1; i <= fila; i++){
            System.out.printf("%2d.  |", i);

            for(int b = 1 ; b <= columna ; b++){
                numeroquiniela = (int)(Math.random()*6+1);
                switch (numeroquiniela) {
                    case 1:
                    case 2:
                    case 3:
                        System.out.print("1  |");
                    break;
                    case 4:
                    case 5:
                        System.out.print(" x |");
                    break;
                    case 6:
                        System.out.print("  2|");
                    break;
                }
            }
            System.out.println("");
        }
        System.out.println("");

        int pleno1 = (int)(Math.random()*4);
        String spleno1;
        int pleno2 = (int)(Math.random()*4);
        String spleno2;
        String tipo1 = "d";
        String tipo2 = "d";
        spleno1 = String.valueOf(pleno1);
        spleno2 = String.valueOf(pleno2);
        if(pleno1>2){
            tipo1 = "s";
            spleno1 = "M";
        }
        if(pleno2>2){
            tipo2 = "s";
            spleno2 = "M";
        }
        System.out.printf("PLENO AL 15 - LOCAL...%" + tipo1 + "   Visitante...%" + tipo2, (pleno1<=2)?pleno1:spleno1, (pleno2<=2)?pleno2:spleno2);
    }
}