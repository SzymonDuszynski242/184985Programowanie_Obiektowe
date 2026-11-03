class Device {
    private String manufacturer;

    public Device(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void checkManu() {
        System.out.println("producent: " + manufacturer);
    }
}

class Computer extends Device {
    private int ramGb;

    public Computer(String manufacturer, int ramGb) {
        super(manufacturer);
        this.ramGb = ramGb;
    }

    public void ram() {
        System.out.println("ilość Ramu:" + ramGb + " GB RAM");
    }
}

class Laptop extends Computer {
    private int batteryCapacityWh;

    public Laptop(String manufacturer, int ramGb, int batteryCapacityWh) {
        super(manufacturer, ramGb);
        this.batteryCapacityWh = batteryCapacityWh;
    }

    public void checkBattery() {
        System.out.println("Pojemność baterii: " + batteryCapacityWh + " Wh");
    }
}