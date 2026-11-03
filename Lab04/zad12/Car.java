public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String brand, int maxSpeed, int numberOfDoors){
        super(brand, maxSpeed);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Dźwięk silnika: PRRRRRRRR");

    }
}