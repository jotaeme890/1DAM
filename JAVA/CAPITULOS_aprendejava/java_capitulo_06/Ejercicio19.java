/**
 * 19 Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
 * el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 * 
 * @author jotaeme
 */



public class Ejercicio19 {
    public static void main(String[] args) {
        int max = 0;
        int min = 201;
        int suma = 0;

        for(int i = 1; i <=50 ; i++){
            int num = (int)(Math.random()*301+(-100));
            System.out.print(num + " ");
            suma = suma + num;
            if(num%2==0 && num>max){
                max = num;
            } else if( num%2!=0 && num < min){
                min = num;
            }
        }

        System.out.println();
        System.out.println("El número par más alto es: " + max + ", el mínimo impar es: " + min + " y la media es: " + (suma/50));
    }
}
