public class Vehicle {
    private String brand;
    protected int maxSpeed;

    public Vehicle(String brand, int maxSpeed) {
    this.brand = brand;
    this.maxSpeed = maxSpeed;
    }

    public void startEngine() {
        System.out.println("Silnik pojazdu marki" + brand + "został uruchomiony");
    }

    @Override
    public String toString() {
        return "Pojazd(Marka=" + brand + "MaksymalnaPrędkość" + maxSpeed + ")";

    }
}
