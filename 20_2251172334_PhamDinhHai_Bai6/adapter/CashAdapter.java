package adapter;

public class CashAdapter implements PaymentSystem {
    private CashService cash;

    public CashAdapter(CashService cash) {
        this.cash = cash;
    }

    @Override
    public void ProcessPayment(double amount) {
         cash.CashPaymentProcessor(amount);
    }
}
