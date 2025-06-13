package adapter;

public class Main {
    public static void main(String[] args) {
        PaymentProcess credit = new CreditCardAdapter(new CreditCardService());
        PaymentProcess cash = new CashAdapter(new CashService());

        credit.ProcessPayment(500); 
        cash.ProcessPayment(200); 
    }
}
