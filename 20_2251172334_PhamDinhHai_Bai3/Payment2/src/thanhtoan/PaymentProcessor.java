package thanhtoan;

public abstract class PaymentProcessor {
    public boolean processPayment(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền không hợp lệ.");
            return false;
        }

        Bill bill = createBill();
        bill.print();
        return true;
    }

    // Factory Method
    protected abstract Bill createBill();
}
