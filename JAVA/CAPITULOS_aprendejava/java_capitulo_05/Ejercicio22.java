/**
 * 22 Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author jotaeme
 * 
 */


public class Ejercicio22 {
    public static void main (String args[]){
            for(int cont = 2; cont<=100 ; cont++){
                boolean esprimo = true;
                for (int i = 2 ; i<= cont/2; i++){
                    if(cont%i == 0){
                        esprimo = false;
                    }
                }
                
                if(esprimo)
                    System.out.println(cont);
            }
    }
}