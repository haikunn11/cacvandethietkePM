package adapter;

public class Main {
    public static void main(String[] args) {
        PaymentProcess System1 = new CreditCardAdapter(new CreditCardService());
        PaymentProcess System2 = new CashAdapter(new CashService());

        System1.ProcessPayment(500); 
        System2.ProcessPayment(200); 
    }
}
