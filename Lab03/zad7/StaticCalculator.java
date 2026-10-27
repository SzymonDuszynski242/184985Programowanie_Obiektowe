public class StaticCalculator {
    private static int numberOfOperations = 0;

    public static double add(double a, double b) {
        numberOfOperations++;
        return a + b;
    }

    public static double subtract(double a, double b) {
        numberOfOperations++;
        return a - b;
    }

    public static double multiply(double a, double b) {
        numberOfOperations++;
        return a * b;
    }

    public static int getNumberOfOperations() {
        return numberOfOperations;
    }
}