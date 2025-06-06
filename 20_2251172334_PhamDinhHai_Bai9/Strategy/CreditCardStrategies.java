package Strategy;

public class CreditCardStrategies implements PaymentStrategy {
    @Override
    public boolean execute(double amount) {
        System.out.println("Processing credit card payment: $" + amount);
      
        return amount <= 1000;
    }
}