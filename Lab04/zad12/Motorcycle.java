public class Motorcycle extends Vehicle {
    private boolean isHarley;

    public Motorcycle(String brand, int maxSpeed, boolean isHarley){
        super(brand, maxSpeed);
        this.isHarley = isHarley;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Dźwięk silnika: VRRRRRRR VRRRRR");
    }
}
