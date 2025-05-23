package payment;

public class CashPaymentBuilder implements PaymentBuilder {
    private CashPaymentProduct product;

    @Override
    public void reset() {
        product = new CashPaymentProduct();
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
        product.setLocation(info);
    }

    public CashPaymentProduct getResult() {
        return product;
    }
}
