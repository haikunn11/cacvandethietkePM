package payment;

public class Main {
    public static void main(String[] args) {
        PaymentDirector director = new PaymentDirector();

       
        CreditCardPaymentBuilder creditBuilder = new CreditCardPaymentBuilder();
        director.makeCreditCardPayment(creditBuilder);
        CreditCardPaymentProduct creditPayment = creditBuilder.getResult();
        creditPayment.process();

      
        CashPaymentBuilder cashBuilder = new CashPaymentBuilder();
        director.makeCashPayment(cashBuilder);
        CashPaymentProduct cashPayment = cashBuilder.getResult();
        cashPayment.process();
    }
}
