public class Main {

    public static void main(String[] args) {
        present(new Dog());
        present(new Cat());
        present(new Cow());

    }
    public static void present(Animal animal) {
        System.out.println(animal);
        animal.makeSound();
    }
}
