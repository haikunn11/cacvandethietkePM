package payment;

public class PaymentDirector {
    public void makeCreditCardPayment(PaymentBuilder builder) {
        builder.reset();
        builder.setAmount(276.0);
        builder.setCurrency("USD");
        builder.setDetails("1234-8888-9999-8273");
    }

    public void makeCashPayment(PaymentBuilder builder) {
        builder.reset();
        builder.setAmount(836.0);
        builder.setCurrency("USD");
        builder.setDetails("Venice");
    }
}
