package brigde;

public class Main {
    public static void main(String[] args) {
        PaymentAccount vip = new VipAccount();
        PaymentAccount normal = new NormalAccount();

        PaymentProcessor credit = new CreditCardProcessor(vip);
        PaymentProcessor cash = new CashProcessor(normal);

        System.out.println(credit.processPayment(9000)); // true
        System.out.println(cash.processPayment(1500));   // false
    }
}
