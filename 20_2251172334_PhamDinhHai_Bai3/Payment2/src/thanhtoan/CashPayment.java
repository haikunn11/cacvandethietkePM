package thanhtoan;

public class CashPayment extends PaymentProcessor {
    @Override
    protected Bill createBill() {
        return new CashBill();
    }
}

