package adapter;

public class Main {
    public static void main(String[] args) {
        PaymentProcess credit = new CreditCardAdapter(new CreditCardService());
        PaymentProcess cash = new CashAdapter(new CashService());

        System.out.println("Thanh toán thẻ: " + credit.ProcessPayment(500)); // true
        System.out.println("Thanh toán tiền mặt: " + cash.ProcessPayment(200)); // true
        System.out.println("Thanh toán âm (tiền mặt): " + cash.ProcessPayment(-50)); // false
    }
}
