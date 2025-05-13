package thanhtoan;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor credit = new CreditCardPayment();
        credit.processPayment(440.0);

        PaymentProcessor cash = new CashPayment();
        cash.processPayment(938.0);
    }
}

