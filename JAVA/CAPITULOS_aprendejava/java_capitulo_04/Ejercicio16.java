/*
  * 16 Realiza un programa que nos diga si hay probabilidad de que
 *     nuestra pareja nos está siendo infiel. El programa irá haciendo
 *     preguntas que el usuario contestará con una v (verdadero) o una
 *     f (falso). Cada pregunta contestada con v sumará 3 puntos.
 *     Las preguntas contestadas con f no suman puntos. Utiliza el
 *     fichero test_infidelidad.txt para obtener las preguntas y las
 *     conclusiones del programa.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String args []){
            Scanner sc = new Scanner (System.in);
            System.out.println("Vamos a ver si tu pareja te es infiel, recuerde solo poner V(Verdadero) o F(Falso), respete las mayúsculas: ");
            
            int puntos = 0;

            System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
            String n = sc.next();
            switch (n) {
                case "V":
                    puntos = puntos+3;
                default:
                    break;
            }
            System.out.println("2. Ha aumentado sus gastos de vestuario: ");
            String n1 = sc.next();
            switch (n1) {
                case "V":
                    puntos = puntos+3;
                default:
                    break;
            }
            System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti:");
            String n2 = sc.next();
            switch (n2) {
                case "V":
                    puntos = puntos+3;
                default:
                    break;
            }
            System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer): ");
            String n3 = sc.next();
            switch (n3) {
                case "V":
                    puntos = puntos+3;
                default:
                    break;
            }
            System.out.println("5. No te deja que mires la agenda de su teléfono móvil: ");
            String n4 = sc.next();
            switch (n4) {
                case "V":
                    puntos = puntos+3;
                default:
                    break;
            }
            System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante: ");
            String n5 = sc.next();
            switch (n5) {
                case "V":
                    puntos = puntos+3;
                default:
                    break;
            }
            System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a:");
            String n6 = sc.next();
            switch (n6) {
                case "V":
                    puntos = puntos+3;
                default:
                    break;
            }
            System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo: ");
            String n7 = sc.next();
            switch (n7) {
                case "V":
                    puntos = puntos+3;
                default:
                    break;
            }
            System.out.println("9. Has notado que últimamente se perfuma más: ");
            String n8 = sc.next();
            switch (n8) {
                case "V":
                    puntos = puntos+3;
                default:
                    break;
            }
            System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
            String n9 = sc.next();
            switch (n9) {
                case "V":
                    puntos = puntos+3;
                default:
                    break;
            }

            if(puntos>=0 && puntos <=10){
                System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
            } else if (puntos >=11 && puntos <=22){
                System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
            } else if (puntos>=22 && puntos <=33)
            System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        sc.close();
    }
}
