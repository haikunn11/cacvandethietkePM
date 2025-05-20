package abstracfactory;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new PaymentProcessor(new CreditCardComponentFactory());
        creditCardProcessor.processPayment(100.0);

        System.out.println("-----------");

        PaymentProcessor cashProcessor = new PaymentProcessor(new CashComponentFactory());
        cashProcessor.processPayment(200.0);
    }
}
