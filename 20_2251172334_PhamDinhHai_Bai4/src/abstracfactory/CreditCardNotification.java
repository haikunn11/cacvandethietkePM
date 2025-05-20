package abstracfactory;

public class CreditCardNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Thong bao: Thanh toan qua the tin dung thanh cong.");
    }
}
