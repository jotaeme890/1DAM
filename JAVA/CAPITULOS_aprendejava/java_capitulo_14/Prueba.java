public class Prueba {
    public static void c(){
        try {
            int i = 10/0;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("No dividas entre 0");
        }

        System.out.println("c");
    }

    public static void b(){
        c();
        System.out.println("b");
    }

    public static void a(){
        b();
        System.out.println("a");
    }

    public static void main(String[] args) {
        a();
    }
}