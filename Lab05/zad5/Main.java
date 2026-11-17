public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog;

        dog.makeSound();
        dog.bark();

        animal.makeSound();

        dog.name = "Reksio";
        System.out.println(animal.name);

        animal.name = "Burek";
        System.out.println(dog.name);
    }
}