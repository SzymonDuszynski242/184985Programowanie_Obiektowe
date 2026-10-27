package app;

import animals.Cat;
import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Burek";
        dog.age = 3;
        dog.makeSound();

        Cat cat = new Cat();
        cat.name = "Mruczek";
        cat.age = 2;
        cat.makeSound();
    }
}