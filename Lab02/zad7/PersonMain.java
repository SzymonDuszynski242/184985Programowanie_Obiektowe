public class PersonMain {
    public static void main(String[] args) {
        System.out.println("Przypadek 1: Person second = first;");
        Person first1 = new Person("Anna");
        Person second1 = first1;
        second1.name = "Maria";
        first1.introduceYourself();
        second1.introduceYourself();

        System.out.println("\nPrzypadek 2: Person second = new Person(first);");
        Person first2 = new Person("Anna");
        Person second2 = new Person(first2);
        second2.name = "Kasia";
        first2.introduceYourself();
        second2.introduceYourself();
    }
}
