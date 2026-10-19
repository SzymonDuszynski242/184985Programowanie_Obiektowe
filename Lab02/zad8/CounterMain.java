public class CounterMain {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.value = 5;
        counter2.value = 10;

        counter1.increaseOther(counter2);

        System.out.println("Wartość counter1: " + counter1.value);
        System.out.println("Wartość counter2: " + counter2.value);
    }
}
