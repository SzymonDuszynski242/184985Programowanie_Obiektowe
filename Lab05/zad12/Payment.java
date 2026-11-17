class Payment {
    public void pay(double amount) {
    }
}

class CardPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Płatność kartą: " + amount);
    }
}

class BlikPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Płatność BLIK: " + amount);
    }
}

class TransferPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Przelew: " + amount);
    }
}