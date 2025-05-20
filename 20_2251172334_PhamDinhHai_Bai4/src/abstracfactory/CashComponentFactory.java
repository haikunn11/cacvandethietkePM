package abstracfactory;

public class CashComponentFactory implements PaymentComponentFactory {
    @Override
    public Bill createBill() {
        return new CashBill();
    }

    @Override
    public Notification createNotification() {
        return new CashNotification();
    }
}
