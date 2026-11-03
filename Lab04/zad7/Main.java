public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 16, 60);

        laptop.checkManu();
        laptop.ram();
        laptop.checkBattery();
    }
}