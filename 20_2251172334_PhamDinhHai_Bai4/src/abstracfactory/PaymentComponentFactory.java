package abstracfactory;

public interface PaymentComponentFactory {
    Bill createBill();
    Notification createNotification();
}

