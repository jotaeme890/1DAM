/**
 * 10 Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
 *necesario.
 * 
 * @author jotaeme
 */



public class Ejercicio10 {
    public static void main(String[] args) {
        int [] numeros = new int [20];
        int contpares= 0;
        int contimpares = 0;

        for(int i = 0; i<20;i++){
            numeros [i] = (int)(Math.random()*101);
            System.out.print(numeros[i] + " ");
            if(numeros[i]%2==0){
                contpares++;
            } else{
                contimpares++;
            }
        }
        int [] pares = new int [contpares];
        int [] impares = new int [contimpares];

        int contpares2=0;
        int contimpares2=0;
        for(int i = 0; i<20;i++){
            if(numeros[i]%2==0){
                pares[contpares2] = numeros[i];
                contpares2++;
            } else{
                impares[contimpares2] = numeros[i];
                contimpares2++;
            }
        }
        
        int contpares3=0;
        int contimpares3=0;
        for(int i = 0; i<20;i++){
            if(i<contpares){
                numeros[i] = pares[contpares3];
                contpares3++;
            } else{
                numeros[i] = impares[contimpares3];
                contimpares3++;
            }

        }

        System.out.println("");
        System.out.println("Después del cambio quedaría: ");
        for(int i = 0; i<20;i++){
        System.out.print(numeros[i] + " ");
        }
    }
}
