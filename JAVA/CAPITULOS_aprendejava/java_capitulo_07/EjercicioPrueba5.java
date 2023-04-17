import java.util.Scanner;


public class EjercicioPrueba5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un valor: ");
        int fila = sc.nextInt();
        int [] [] matriz = new int [fila] [fila]; //[i] [j]

        for(int i = 0; i<fila ; i++){
            for(int  j= 0; j<fila;  j++){
                if((i+j)%2==0){
                    matriz[i][j] = 1;
                } else{
                    matriz[i][j] = 0;
                }
            }
        }

        for(int i = 0;i<fila;i++){
            for(int j= 0;j<fila;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    } 
}
