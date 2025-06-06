package Strategy;

public class CashStrategies implements PaymentStrategy {
    @Override
    public boolean execute(double amount) {
        System.out.println("Processing cash payment: $" + amount);
    
        return true;
    }
}
