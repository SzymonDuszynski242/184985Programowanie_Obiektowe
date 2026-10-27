public class Product {
    private String name;
    private double price;
    private static int numberOfProducts = 0;
    public static final int MAX_PRODUCTS = 100;

    public Product(String name, double price) {
        if (numberOfProducts >= MAX_PRODUCTS) {
            throw new IllegalStateException();
        }
        this.name = name;
        this.price = price;
        numberOfProducts++;
    }

    public static int getNumberOfProducts() {
        return numberOfProducts;
    }
}