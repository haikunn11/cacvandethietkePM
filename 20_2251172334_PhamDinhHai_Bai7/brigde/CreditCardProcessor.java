package brigde;

public class CreditCardProcessor extends PaymentProcessor {
    public CreditCardProcessor(PaymentAccount account) {
        super(account);
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Thanh toán bằng thẻ tín dụng...");
        return amount > 0 && amount <= account.getTransactionLimit();
    }
}
