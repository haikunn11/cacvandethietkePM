package brigde;

public class CashProcessor extends PaymentProcessor {
    public CashProcessor(PaymentAccount account) {
        super(account);
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Thanh toán bằng tiền mặt...");
        return amount > 0 && amount <= account.getTransactionLimit();
    }
}
