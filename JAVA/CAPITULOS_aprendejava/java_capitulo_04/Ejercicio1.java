/*
 * 1 Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a 
 * primera hora ese día
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio1{
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un día de la semana: ");
        String  n = sc.next();

        if(n.toUpperCase().equals("LUNES")){
            System.out.print("La asignatura que tenemos el Lunes, es Programación");
        } else if(n.toUpperCase().equals("MARTES")){
            System.out.print("La asignatura que tenemos el Martes es, Sistemas informáticos");
        }else if(n.toUpperCase().equals("MIÉRCOLES") ||n.toUpperCase().equals("MIERCOLES")){
            System.out.print("La asignatura que tenemos el Miércoles, es Entornos de desarrollo");
        }else if(n.toUpperCase().equals("JUEVES")){
            System.out.print("La asignatura que tenemos el Jueves, es Programación");
        }else if(n.toUpperCase().equals("VIERNES")){
            System.out.print("La asignatura que tenemos el Viernes, es Formación y Orientación Laboral");
        } else 
            System.out.print("Lo siento no te he entendido, repite el día por favor");

        sc.close();

    }
}