package Payment;

public class CashPayment extends PaymentProcessor {
	 @Override
	    public boolean processPayment(double amount) {
	        if (amount > 0) {
	            System.out.println("Thanh toán bằng tiền mặt thành công");
	            return true;
	        } else {
	            return false;
	        }
	    }
}
