/**
 * 15 Realiza un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
 * la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual
 * a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 * compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
 * con dos barras.
 * d) La última nota de la melodía debe coincidir con la primera.
 * 
 * @author jotaeme
 */



public class Ejercicio15 {
    public static void main(String[] args) {

        int melodias = 4*(int)(Math.random()*7+1); //hacemos que sean número múltiplos de 4
        String nota  = "";
        String primera = "";

        for(int contador = 1; contador <= melodias ; contador ++){
            switch ((int)(Math.random()*7+1)) { //definir nota al azar
                case 1:
                    nota = "do";
                break;
                case 2:
                    nota = "re";
                break;
                case 3:
                    nota = "mi";
                    break;
                case 4:
                    nota = "fa";
                break;
                case 5:
                    nota = "sol";
                break;
                case 6:
                    nota = "la";
                break;
                case 7:
                    nota = "si";
                break;
            }

            
            if (contador == 1){ //si el contador del bucle es el primer valor lo guardamos para su posterior uso para el último valor de la melodía
                primera = nota;
            }

            if (contador == melodias){ //así ponemos la primera nota igual con la última
                nota = primera;
            }

            System.out.print(nota + " ");
            
            if(contador == melodias){
                System.out.print("|| ");
            } else if(contador%4==0){
                System.out.print("| ");
            }
            
        }
    }
}
