/**
 * 4 Escribe un programa que muestre tu horario de clase.
 * 
 *  @author jotaeme
*/

public class Ejercicio4 {
    public static void main(String args[]){
        System.out.printf("%-11s %-10s %-10s %-10s %-10s %-10s\n"," HORAS", "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-11s %-10s %-10s %-10s %-10s %-10s\n","8:15-9:15", "PROG.", "SISIN.", "ENTDE.", "PROG.", "FOL");
        System.out.printf("%-11s %-10s %-10s %-10s %-10s %-10s\n","9:15-10:15", "PROG.", "SISIN.", "ENTDE.", "PROG.", "FOL");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n","10:15-11:15", "LDEMA.", "SISIN.", "PROG.", "LDEMA.", "FOL");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n","11:45-12:45", "LDEMA.", "PROG.", "PROG.", "LDEMA.", "SISIN.");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n","12:45-13:45", "BBDD.", "PROG.", "BBDD.", "BBDD.", "SISIN.");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n","13:45-14:45", "BBDD.", "ENTDE.", "BBDD.", "BBDD.", "SISIN.");
    }
}
