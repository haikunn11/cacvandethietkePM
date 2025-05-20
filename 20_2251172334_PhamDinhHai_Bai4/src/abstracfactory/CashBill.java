package abstracfactory;

public class CashBill implements Bill {
    @Override
    public void print() {
        System.out.println("In hoa don: Da thanh toan bang tien mat.");
    }
}

