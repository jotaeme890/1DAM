/**
 * 30 Realiza una programa que calcule las horas transcurridas entre dos horas de
 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una
 * cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
 * los datos correctamente y que el segundo día es posterior al primero.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio30 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un día de la semana (1-7): ");
        int dia1 = sc.nextInt();
        System.out.print("Dime la hora deseada en formato 24H: ");
        int hora1 = sc.nextInt();

        System.out.print("Dime otro día de la semana (1-7): ");
        int dia2 = sc.nextInt();
        System.out.print("Dime la hora deseada en formato 24H: ");
        int hora2 = sc.nextInt();
        int sdia = 0;
        int sdia2 = 0;
        int horas=24-hora1+hora2;/*Con esto lo que hacemos es saber las horas de la hora1 hasta las 00 de ese día y las horas para hora2*/

        if(dia1 < 1 || dia1 > 7 || dia2 < 1 || dia2 > 7){
            System.out.println("Esos días no son correctos");
        } else if(dia1 > dia2){
            System.out.println("Esos días no son correctos");
        } else{
            sdia = dia1;
            sdia2 = dia2;

            while(sdia+1<sdia2){ /*Con esto lo que hacemos es que si es de un día a otro no se meta y así no sume 24H másy solo se quede con las H de horas*/
                horas=horas+24;
                sdia++;
            }
            System.out.print("Entre las "+hora1+" del "+dia1+" y las "+hora2+" del "+dia2+" hay "+horas+"H");
        }
        
		sc.close();
            
    }
}