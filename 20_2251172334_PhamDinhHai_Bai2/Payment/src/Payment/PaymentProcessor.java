package Payment;

public class PaymentProcessor {
	public boolean processPayment(double amount) {
        if (amount > 0) {
            return true;
        } else {
            return false;
        }
    }
}
