/** 
 * 25 Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
 * 
 * @author jotaeme
*/



import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        int lastDigit = n%10;

        int tmp =n;
        int rotatedNum = 0;
        while (tmp/10>0) {
            rotatedNum = rotatedNum*10;
            lastDigit = tmp%10;
            rotatedNum = rotatedNum + lastDigit;
            tmp /= 10;
        }
        System.out.print(rotatedNum = rotatedNum *10 + tmp);

        sc.close();
    }
}
