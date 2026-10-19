public class MainDog {
    public static void main(String[] args) {
        Dog pies1 = new Dog("Sierściuch", "owczarek", 4);
        Dog pies2 = new Dog("Stasiek", "terrier", 6);
        pies1.bark();
        pies1.showInformation();
        pies2.bark();
        pies2.showInformation();
    }
}
