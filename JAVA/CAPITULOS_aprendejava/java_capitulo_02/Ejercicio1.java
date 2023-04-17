/**
 *  1 Escribe un programa en el que se declaren las variables enteras x e y. Asígnales 
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla 
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 * 
 * @author jotaeme
 */

public class Ejercicio1{
    public static void main(String args[]){
        int x = 144;
        int y = 999;

        System.out.println("x= "+x);
        System.out.println("y= "+y);
        System.out.println("La suma es: "+(x+y));
        System.out.println("La resta es :"+(x-y));
        System.out.println("La divisón es: "+(x/y));
        System.out.println("La multiplicación es: "+(x*y));
    }
}