/**
 * 3 Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 * 
 * @author jotaeme
 */



public class Ejercicio3 {
    public static void main(String[] args) {
        int numerocarta = (int)(Math.random()*10+1);
        String carta = "";

        switch (numerocarta) {
            case 1:
                carta = "As";
            break;
            case 8:
                carta = "Sota";
            break;
            case 9:
                carta = "Caballo";
            break;
            case 10:
                carta = "Rey";
            break;
        
            default:
            carta = String.valueOf(numerocarta);
            break;
        }

        int numeropalo = (int)(Math.random()*4+1);
        String palo = "";
        switch (numeropalo) {
            case 1:
                palo = "Oros";
            break;
            case 2:
                palo = "Bastos";
            break;
            case 3:
                palo = "Copas";
            break;
            case 4:
                palo = "Espadas";
            break;
        }

        System.out.print(carta+ " de " + palo);
    }
}
