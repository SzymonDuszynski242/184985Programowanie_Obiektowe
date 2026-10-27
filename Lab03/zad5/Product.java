public class Product {
    private String name;
    private double price;
    private static int numberOfProducts = 0;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        numberOfProducts++;
    }

    public static int getNumberOfProducts() {
        return numberOfProducts;
    }
}
