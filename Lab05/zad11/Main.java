public class Main {
    public static void main(String[] args) {
        Animal animal = new GuideDog();

        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Dog);
        System.out.println(animal instanceof GuideDog);

        System.out.println(animal.getClass() == Animal.class);
        System.out.println(animal.getClass() == Dog.class);
        System.out.println(animal.getClass() == GuideDog.class);
    }
}