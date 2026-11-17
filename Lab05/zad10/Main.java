class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class Main {
    static void identify(Animal animal) {
        System.out.println("Animal");
    }

    static void identify(Dog dog) {
        System.out.println("Dog");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();

        identify(animal);
        animal.makeSound();
    }
}