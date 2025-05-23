package payment;

public class CreditCardPaymentProduct {
    private double amount;
    private String currency;
    private String cardNumber;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void process() {
        System.out.println("Credit Card Payment: " + amount + " " + currency + " via card " + cardNumber);
    }
}
