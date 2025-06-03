package Mediator;

public class CashPayment {
    private Mediator mediator;

    public CashPayment(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean processPayment(double amount) {
        System.out.println("Processing cash payment: " + amount);
        mediator.notify(this);
        return true;
    }
}
