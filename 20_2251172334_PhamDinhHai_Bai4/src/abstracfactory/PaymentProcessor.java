package abstracfactory;

public class PaymentProcessor {
    private final PaymentComponentFactory factory;

    public PaymentProcessor(PaymentComponentFactory factory) {
        this.factory = factory;
    }

    public boolean processPayment(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền không hợp lệ.");
            return false;
        }

        Bill bill = factory.createBill();
        Notification notification = factory.createNotification();

        bill.print();
        notification.send();

        return true;
    }
}

