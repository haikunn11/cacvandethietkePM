package brigde;

public abstract class PaymentProcessor {
    protected PaymentAccount account;

    public PaymentProcessor(PaymentAccount account) {
        this.account = account;
    }

    public abstract boolean processPayment(double amount);
}
