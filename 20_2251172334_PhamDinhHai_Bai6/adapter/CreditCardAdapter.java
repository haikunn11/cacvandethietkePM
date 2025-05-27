package adapter;

public class CreditCardAdapter implements PaymentProcess {
    private CreditCardService creditcard;

    public CreditCardAdapter(CreditCardService creditcard) {
        this.creditcard = creditcard;
    }

    @Override
    public boolean ProcessPayment(double amount) {
        return creditcard.CreditCardPaymentProcessor(amount);
    }
}
