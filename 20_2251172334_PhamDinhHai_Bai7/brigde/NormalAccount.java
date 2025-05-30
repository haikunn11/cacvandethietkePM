package brigde;

public class NormalAccount implements PaymentAccount {
    @Override
    public double getTransactionLimit() {
        return 1000.0; 
    }
}