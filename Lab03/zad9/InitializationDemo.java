public class InitializationDemo {

    static String statycznePole = initStatycznePole();

    String poleInstancji = initPoleInstancji();

    static {
        System.out.println("Blok statyczny");
    }

    {
        System.out.println("Blok instancyjny");
    }

    public InitializationDemo() {
        System.out.println("Konstruktor");
    }

    static String initStatycznePole() {
        System.out.println("Statyczne pole");
        return "statyczne";
    }

    String initPoleInstancji() {
        System.out.println("Pole instancji");
        return "instancja";
    }

    public static void main(String[] args) {
        System.out.println("Tworzenie pierwszego obiektu");
        new InitializationDemo();
        System.out.println("Tworzenie drugiego obiektu");
        new InitializationDemo();
    }
}