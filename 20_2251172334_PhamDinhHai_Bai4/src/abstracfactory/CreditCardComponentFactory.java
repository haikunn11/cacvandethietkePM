package abstracfactory;

public class CreditCardComponentFactory implements PaymentComponentFactory {
    @Override
    public Bill createBill() {
        return new CreditCardBill();
    }

    @Override
    public Notification createNotification() {
        return new CreditCardNotification();
    }
}
