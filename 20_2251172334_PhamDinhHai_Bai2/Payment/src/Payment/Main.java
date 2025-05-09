package Payment;

public class Main {
	public static void main(String[] args) {
        PaymentProcessor creditCard = new CreditCardPayment();
        PaymentProcessor cash = new CashPayment();

        System.out.println("Test 1: " + creditCard.processPayment(500));  // true + in ra thông báo
        System.out.println("Test 2: " + creditCard.processPayment(-100)); // false

        System.out.println("Test 3: " + cash.processPayment(300));        // true + in ra thông báo
        System.out.println("Test 4: " + cash.processPayment(-50));        // false
    }
}
