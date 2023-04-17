/**
 *  8 Escribe un programa que declare 5 variables de tipo char. A continuación, 
 * crea otra variable como cadena de caracteres y asígnale como valor la concatenación de las anteriores 5 variables. 
 * Por último, muestra la cadena de caracteres por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 * 
 * @author jotaeme
 */

public class Ejercicio8 {
    public static void main (String args []){

        char p = 'P';
        char e = 'e';
        char r = 'r';
        char r2= 'r';
        char o= 'o';

        //If we put the caracter the variable do an addition of the asci´s valor of that caracter.
        //The solution is put a "" at the biginning. 
        String perro = ""+ p + e + r + r2 + o;
        System.out.println(perro);
    }
}
