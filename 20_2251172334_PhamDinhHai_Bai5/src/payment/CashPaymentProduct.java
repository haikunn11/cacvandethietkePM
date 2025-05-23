package payment;

public class CashPaymentProduct {
    private double amount;
    private String currency;
    private String location;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void process() {
        System.out.println("Cash Payment: " + amount + " " + currency + " at " + location);
    }
}

