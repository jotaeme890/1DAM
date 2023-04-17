/**
 * 8 Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        int [] temperatura = new int [12];
        
        for(int i = 0;i <12 ;i++){ //damos los valores de la temperatura según el mes
            System.out.print("Que temperatura hacia en " + meses[i] + ":");
            temperatura [i] = sc.nextInt();
        }

        for(int i = 0; i<12;i++){ //sabiendo que hay 12 meses, los ponemos y justo después le damos el valor de la temperatura a un carácter para ponerlo por pantalla las veces que sea temperatura 
            System.out.printf("%-10s -> %2s",meses[i]," ");
            for(int b = 1; b<=temperatura[i] ;b++){
                System.out.print(" [] ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
