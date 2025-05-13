package thanhtoan;

public class CreditCardPayment extends PaymentProcessor {
    @Override
    protected Bill createBill() {
        return new CreditCardBill();
    }
}

