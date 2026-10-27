public class MainCalculator {
    public static void main(String[] args) {
        System.out.println(StaticCalculator.add(5, 3));
        System.out.println(StaticCalculator.subtract(10, 4));
        System.out.println(StaticCalculator.multiply(2, 6));

        System.out.println(StaticCalculator.getNumberOfOperations());
    }
}