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
    public void digHole() {
        System.out.println("Digging a hole");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
    public void climb() {
        System.out.println("Climbing");
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