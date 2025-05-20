package abstracfactory;

public class CreditCardBill implements Bill{
	@Override
    public void print() {
        System.out.println("In hoa don : Da thanh toan qua the tin dung.");
    }
}
