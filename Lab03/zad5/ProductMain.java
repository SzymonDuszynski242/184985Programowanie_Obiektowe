public class ProductMain {
    public static void main(String[] args) {
        System.out.println(Product.getNumberOfProducts());

        Product p1 = new Product("Laptop", 3500.0);
        Product p2 = new Product("Myszka", 120.0);
        Product p3 = new Product("Klawiatura", 250.0);

        System.out.println(Product.getNumberOfProducts());
    }
}