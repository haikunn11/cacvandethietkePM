package adapter;

public class CreditCardService {
    public boolean CreditCardPaymentProcessor(double amount) {
        return amount > 0;
    }
}
