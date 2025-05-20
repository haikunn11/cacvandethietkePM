package abstracfactory;

public class CashNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Thong bao: Thanh toan bang tien mat thanh cong.");
    }
}

