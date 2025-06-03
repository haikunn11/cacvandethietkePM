package Mediator;

public class PaymentMediator implements Mediator {
    private CashPayment cashPayment;
    private CreditCardPayment creditCardPayment;

    public void setCashPayment(CashPayment cashPayment) {
        this.cashPayment = cashPayment;
    }

    public void setCreditCardPayment(CreditCardPayment creditCardPayment) {
        this.creditCardPayment = creditCardPayment;
    }

    @Override
    public void notify(Object sender) {
        if (sender instanceof CashPayment) {
            onCash();
        } else if (sender instanceof CreditCardPayment) {
            onCreditCard();
        }
    }

    public void onCash() {
        System.out.println("Mediator: Cash payment completed.");
    }

    public void onCreditCard() {
        System.out.println("Mediator: Credit card payment completed.");
    }
}
