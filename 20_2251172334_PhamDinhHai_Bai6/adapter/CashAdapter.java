package adapter;

public class CashAdapter implements PaymentProcess {
    private CashService cash;

    public CashAdapter(CashService cash) {
        this.cash = cash;
    }

    @Override
    public void ProcessPayment(double amount) {
        return cash.CashPaymentProcessor(amount);
    }
}
