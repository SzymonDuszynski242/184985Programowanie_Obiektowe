public class Main {
    public static void main(String[] args) {
        Animal first = new Dog();
        Animal second = new Cat();

        if (first instanceof Dog) {
            Dog myDog = (Dog) first;
            myDog.digHole();
        }

        if (second instanceof Cat) {
            Cat myCat = (Cat) second;
            myCat.climb();
        }

        try {
            Dog dog = (Dog) second;
        } catch (ClassCastException e) {
            System.out.println("wyjątek " + e.getClass().getSimpleName());
        }
    }
}