package payment;

public class CreditCardPaymentBuilder implements PaymentBuilder {
    private CreditCardPaymentProduct product;

    @Override
    public void reset() {
        product = new CreditCardPaymentProduct();
    }

    @Override
    public void setAmount(double amount) {
        product.setAmount(amount);
    }

    @Override
    public void setCurrency(String currency) {
        product.setCurrency(currency);
    }

    @Override
    public void setDetails(String info) {
        product.setCardNumber(info);
    }

    public CreditCardPaymentProduct getResult() {
        return product;
    }
}
