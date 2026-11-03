public class Truck extends Vehicle {
    private double payloadCapacity;
    public Truck(String brand, int maxSpeed, double payloadCapacity) {
        super(brand, maxSpeed);
        this.payloadCapacity = payloadCapacity;
    }
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Dźwięk silnika:  BRRRRR!!!");
    }
}
