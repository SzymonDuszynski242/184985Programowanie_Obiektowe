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

    public Car(Car other) {
        this.brand = other.brand;
        this.model = other.model;
        this.productionYear = other.productionYear;
        this.mileage = other.mileage;
    }

    public void drive(double distance) {
        if (distance > 0) {
            this.mileage += distance;
        }
    }

    public void showInformation() {
        System.out.println(brand + " " + model + " (" + productionYear + "), przebieg: " + mileage);
    }

    public static void main(String[] args) {
        Car original = new Car("Toyota", "Corolla", 2020, 15000.0);
        Car copy = new Car(original);

        original.mileage = 20000.0;

        original.showInformation();
        copy.showInformation();
    }
}