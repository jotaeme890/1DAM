/*
  * 22 Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String args []){
            Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número para saber el día de la semana (del 1-5): ");
        int  n = sc.nextInt();
        System.out.print("Dime la hora separando las horas (formato 24H) y los minutos separando por coma:  ");
        float n1 = sc.nextFloat();
        int dias = -1;

        switch(n) {
            case 1:
                dias = 3;
            break;

            case 2:
                dias=2;
            break;

            case 3:
            dias=1;
            break;

            case 4:
            dias=0;
            break;
        }
        
        if (dias >= 0 ){
        System.out.println("Faltan " + ((24*60 - (((int)n1)*60 + (((n1 - (int)n1)*100)))) /*minutos a media noche de ese día*/+ ((24*60)*dias) /*calcular para el jueves*/ + (15*60))/*de media noche a las 15:00 del viernes*/ + " segundos para el Viernes a las 15:00");
        sc.close();
        }else 
        System.out.print("Los datos están mal introducidos");
    }
}