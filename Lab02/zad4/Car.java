public class Car {
    String brand;
    String model;
    int productionYear;
    double mileage;

    public Car() {
        this("", "", 0, 0.0);
    }

    public Car(String brand, String model) {
        this(brand, model, 0, 0.0);
    }

    public Car(String brand, String model, int productionYear, double mileage) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }

    public void drive(double distance) {
        if (distance > 0) {
            this.mileage += distance;
        }
    }

    public void showInformation() {
        System.out.println(brand + " " + model + " (" + productionYear + "), przebieg: " + mileage);
    }
}