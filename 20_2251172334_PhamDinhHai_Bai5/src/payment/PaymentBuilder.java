package payment;

public interface PaymentBuilder {
    void reset();
    void setAmount(double amount);
    void setCurrency(String currency);
    void setDetails(String info); 
}
