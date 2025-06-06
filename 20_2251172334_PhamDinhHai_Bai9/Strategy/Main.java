package Strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

    
        context.setStrategy(new CreditCardStrategies());
        boolean result1 = context.processPayment(500);
        System.out.println("CreditCard Payment success: " + result1);

      
        context.setStrategy(new CashStrategies());
        boolean result2 = context.processPayment(2000);
        System.out.println("Cash Payment success: " + result2);
    }
}
