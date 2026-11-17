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

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}

class Sheep extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Baa");
    }
}