public class Main {
    public static void main(String[] args) {
        Payment[] payments = {
                new CardPayment(),
                new BlikPayment(),
                new TransferPayment()
        };

        for (Payment payment : payments) {
            payment.pay(99.99);
        }
    }}