class Game {
    public final void initialize() {
        System.out.println("Inicjalizacja gry");
    }

    public void start() {
        System.out.println("Start gry");
    }
}

class RPG extends Game {
    @Override
    public void start() {
        System.out.println("Start gry RPG");
    }
}

final class SimpleFinalClass {
}