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

    public double getCredit() {
        return this.credit;
    }

    public double getCash() {
        return this.cash;
    }

    public void addMoney(double amountEntered){
        this.credit += amountEntered;
    }

    public double giveRefund() {

        double refundAmount = this.credit;

        this.credit = 0;

        return refundAmount;
    }

    public int getStockLevelForTray(Selection selection) {
        return products.get(selection).getStockLevel();
    }

    public Product vend(Selection selection) {
        Product product = null;
        Tray tray = products.get(selection);
//        check credit is greater than or equal to the name of the row
        if (credit >= tray.getPrice()){
//        check tray is in stock
            if (tray.getStockLevel() > 0) {
//        get Product from tray
                product = tray.ejectProduct();
//        cash goes up
                cash += credit;
//        credit goes down
                credit = 0;
            }

        }
        return product;
    }
}
