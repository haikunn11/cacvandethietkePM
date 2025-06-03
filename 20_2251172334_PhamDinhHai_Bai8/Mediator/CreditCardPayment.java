package Mediator;

public class CreditCardPayment {
    private Mediator mediator;

    public CreditCardPayment(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean processPayment(double amount) {
        System.out.println("Processing credit card payment: " + amount);
        mediator.notify(this);
        return true;
    }
}
