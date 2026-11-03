class Animal {
    public void makeSound() {
        System.out.println("Dźwięk zwierzęcia");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Hau hau");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Miau");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Muu");
    }
}