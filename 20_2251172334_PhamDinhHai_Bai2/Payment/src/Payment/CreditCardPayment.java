package Payment;

public class CreditCardPayment extends PaymentProcessor {
	@Override
    public boolean processPayment(double amount) {
        if (amount > 0) {
            System.out.println("Thanh toán bằng thẻ tín dụng thành công");
            return true;
        } else {
            return false;
        }
    }
}
