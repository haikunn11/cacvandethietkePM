package brigde;

public class VipAccount implements PaymentAccount {
    @Override
    public double getTransactionLimit() {
        return 10000.0; 
    }
}
