/**
 * 29 Realiza un programa que muestre la previsión del tiempo para mañana en
 * Málaga. Las temperaturas máxima y mínima se deben generar de forma
 * aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
 * últimas décadas para cada estación. La probabilidad de que esté soleado
 * o nublado en cada estación se proporciona a continuación. Obviamente, la
 * temperatura mínima deberá ser menor o igual que la temperatura máxima.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("1) Primavera");
        System.out.println("2) Verano");
        System.out.println("3) Otoño");
        System.out.println("4) Invierno");
        System.out.print("Dime una estación del año (Dime el número por favor): ");
        int estacion = sc.nextInt();
        int temperaturamax = 0;
        int temperaturamin = 0;
        int humedad = 0;
        String humedadm = " ";

        System.out.println();

        switch (estacion) {
            case 1: //primavera, máxima 30 - mínima 15, 60%-40%
                System.out.println("Previsión para mañana");
                System.out.println("------------------------------------");
                do {
                    temperaturamax = (int)(Math.random()*16+15);
                    temperaturamin = (int)(Math.random()*16+15);
                    humedad = (int)(Math.random()*10+1);
                    switch (humedad) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            humedadm = "Soleado";
                        break;
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            humedadm = "Nublado";
                        break;
                    }
                } while (temperaturamin < temperaturamax);
                System.out.println( "La temperatura mínima será: " + temperaturamax);
                System.out.println("La temperatura máxima será: " + temperaturamin);
                System.out.println(humedadm);
            break;

            case 2: //verano, máxima 45 - mínima 25, 80%-20%
            System.out.println("Previsión para mañana");
            System.out.println("------------------------------------");
            do {
                temperaturamax = (int)(Math.random()*21+25);
                temperaturamin = (int)(Math.random()*21+25);
                humedad = (int)(Math.random()*10+1);
                switch (humedad) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        humedadm = "Soleado";
                    break;
                    case 9:
                    case 10:
                        humedadm = "Nublado";
                    break;
                }
            } while (temperaturamin < temperaturamax);
            System.out.println( "La temperatura mínima será: " + temperaturamax);
            System.out.println("La temperatura máxima será: " + temperaturamin);
            System.out.println(humedadm);
            break;

            case 3: //otoño, máxima 30 - mínima 20, 40%-60%
            System.out.println("Previsión para mañana");
            System.out.println("------------------------------------");
            do {
                temperaturamax = (int)(Math.random()*11+20);
                temperaturamin = (int)(Math.random()*11+20);
                humedad = (int)(Math.random()*10+1);
                switch (humedad) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        humedadm = "Soleado";
                    break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        humedadm = "Nublado";
                    break;
                }
            } while (temperaturamin < temperaturamax);
            System.out.println( "La temperatura mínima será: " + temperaturamax);
            System.out.println("La temperatura máxima será: " + temperaturamin);
            System.out.println(humedadm);
            break;

            case 4: //invierno, máxima 25 - mínima 0, 20%-80%
            System.out.println("Previsión para mañana");
            System.out.println("------------------------------------");
            do {
                temperaturamax = (int)(Math.random()*26);
                temperaturamin = (int)(Math.random()*26);
                humedad = (int)(Math.random()*10+1);
                switch (humedad) {
                    case 1:
                    case 2:
                        humedadm = "Soleado";
                    break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        humedadm = "Nublado";
                    break;
                }
            } while (temperaturamin < temperaturamax);
            System.out.println( "La temperatura mínima será: " + temperaturamax);
            System.out.println("La temperatura máxima será: " + temperaturamin);
            System.out.println(humedadm);
            break;
        }
        sc.close();
    }
}
