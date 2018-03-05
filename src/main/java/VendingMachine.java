import java.util.HashMap;

public class VendingMachine {
    private double credit;
    private double cash;
    private HashMap<Selection, Tray> products;

    public VendingMachine(HashMap<Selection, Tray> products, double cash) {
        this.products = products;
        this.cash = cash;
        this.credit = 0;
    }


}
