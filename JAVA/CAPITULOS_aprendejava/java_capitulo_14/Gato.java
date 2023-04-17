public class Gato extends Mamifero{
        public Gato () {
            super(Sexo.MACHO);
        }
    
        public Gato (Sexo s) {
            super(s);
        }
    
        public void maulla(){
            System.out.println("Miauuuu");
        }
    
        public void caza(){
            System.out.println("Estoy cazando");
        }

        public Gato apareaCon(Gato x) throws ExcepcionApareamientoImposible{
            if(this.getSexo().equals(x.getSexo())){
                throw new ExcepcionApareamientoImposible();
            } else{
                return new Gato();
            }
        }

        @Override 
        public String toString(){
            return "miaaaaaau acabo de nacer y soy " + this.getSexo();
        }
}
