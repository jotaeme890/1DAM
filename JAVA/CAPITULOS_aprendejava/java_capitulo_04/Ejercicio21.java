/*
  * 21 Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá 
 * las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
 *se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
 *ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
 * de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
 * la nota media anterior.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String args []){
            Scanner sc = new Scanner (System.in);
            System.out.println("Dime la nota del primer examen: ");
            int n = sc.nextInt();
            System.out.println("Dime la nota del segundo examen: ");
            int n1 = sc.nextInt();

            float media = ((n+n1)/2);

            if (n >=0 && n<=10 && n1>=0 && n1<=10){
                if (media >= 5 ){
                    System.out.println("Tu nota de programación es: " + media);
                } else if (media < 5 ){
                    System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto / no apto)");
                    String exm= sc.nextLine();
                    exm= sc.nextLine();
                    if (exm.equals("apto")){
                    System.out.println("Tu nota de programación es: 5 ");
                        }else if (exm.equals("no apto")){
                        System.out.println("Tu nota de programación es: " + n1);
                        }
            } 
            }else {
                System.out.print("Dime bien los valores");
            }  
        sc.close();
    }
}