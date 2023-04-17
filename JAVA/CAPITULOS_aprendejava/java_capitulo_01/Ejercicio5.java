/**
 * 5 Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente.
 * 
 *  @author jotaeme
*/

public class Ejercicio5 {
    public static void main(String args[]){

        String rojo = "\033[31m"; 
        String blanco ="\033[97m";
        String negro ="\033[90m";
        String verde ="\033[32m";
        String amarillo ="\033[33m";
        String azul = "\033[34m";
        String morado ="\033[35m";
        String cian ="\033[36m";

        System.out.printf("%-16s %-15s %-15s %-15s %-15s %-15s\n", rojo+"HORAS", blanco+"LUNES", blanco+"MARTES", blanco+"MIÉRCOLES", blanco+"JUEVES", blanco+"VIERNES");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-16s %-15s %-15s %-15s %-15s %-15s\n",rojo+"8:15-9:15", negro+"PROG.", azul+"SISIN.", cian+"ENTDE.", negro+"PROG.", morado+"FOL");
        System.out.printf("%-16s %-15s %-15s %-15s %-15s %-15s\n",rojo+"9:15-10:15", negro+"PROG.", azul+"SISIN.", cian+"ENTDE.", negro+"PROG.", morado+"FOL");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n",rojo+"10:15-11:15", verde+"LDEMA.", azul+"SISIN.", negro+"PROG.", verde+"LDEMA.", morado+"FOL");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n",rojo+"11:45-12:45", verde+"LDEMA.", negro+"PROG.", negro+"PROG.", verde+"LDEMA.", azul+"SISIN.");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n",rojo+"12:45-13:45", amarillo+"BBDD.", negro+"PROG.", amarillo+"BBDD.", amarillo+"BBDD.", azul+"SISIN.");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n",rojo+"13:45-14:45", amarillo+"BBDD.", cian+"ENTDE.", amarillo+"BBDD.", amarillo+"BBDD.", azul+"SISIN.");
    }
}
