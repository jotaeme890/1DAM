/**
 * 69 Realiza un programa que pinte una pirámide maya. Por los lados, se trata
 * de una pirámide normal y corriente. Por el centro se van pintando líneas de
 * asteriscos de forma alterna (empezando por la superior): la primera se pinta,
 * la segunda no, la tercera sí, la cuarta no, etc. La terraza de la pirámide siempre
 * tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide
 * normal tienen 4 asteriscos. El programa pedirá la altura. Se supone que el
 * usuario introducirá un número entero mayor o igual a 3; no es necesario
 * comprobar los datos de entrada.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio69 {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int altura = sc.nextInt();
        
        for(int i = 1; i<= altura ; i++){
            for(int espaciolat = altura-i ; espaciolat >= 0; espaciolat--){
                System.out.print(" ");
            }
            if(i%2==0){
                for(int asteriscos = 1; asteriscos <= i; asteriscos++){
                    System.out.print("X"); 
                }
                for(int espacios = 1; espacios <= 4; espacios ++){
                    System.out.print(" ");
                }
                for(int asteriscos = 1; asteriscos <= i; asteriscos++){
                    System.out.print("X"); 
                }

            } else{
                for(int asterisco = 1 ; asterisco <= (2*i)+4 ; asterisco++){
                    System.out.print("X");  
                }
            }
            
            System.out.println("");
        }
        
        sc.close();
    }
}
