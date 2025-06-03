package Mediator;

public class Main {
    public static void main(String[] args) {
        PaymentMediator mediator = new PaymentMediator();

        CashPayment cash = new CashPayment(mediator);
        CreditCardPayment credit = new CreditCardPayment(mediator);

        mediator.setCashPayment(cash);
        mediator.setCreditCardPayment(credit);

        cash.processPayment(100.0);
        credit.processPayment(250.0);
    }
}

