public class Ejercicio2 {
    public static void main(String[] args) throws ExcepcionApareamientoImposible {
        Gato garfield = new Gato();
        Gato pepe = new Gato();
        Gato maria = new Gato(Sexo.HEMBRA);

        try {
            Gato cria = garfield.apareaCon(maria);
            System.out.println(cria);
            System.out.println();

            Gato cria2 = garfield.apareaCon(pepe);

        } catch (ExcepcionApareamientoImposible e) {
        }
    }
}
