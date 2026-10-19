public class PersonMain {
    public static void main(String[] args) {
        Person first = new Person("Anna");
        Person second = first;

        second.name = "Maria";

        first.introduceYourself();
        second.introduceYourself();
    }
}
