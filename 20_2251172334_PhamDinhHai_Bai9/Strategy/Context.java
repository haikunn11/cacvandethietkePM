package Strategy;

public class Context {
    private PaymentStrategy paymentStrategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public boolean processPayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("No payment strategy set");
        }
        return paymentStrategy.execute(amount);
    }
}