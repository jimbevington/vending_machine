import java.util.ArrayList;

public class Customer {
    private ArrayList<Product> inventory;
    private double cash;
    private String name;

    public Customer(String name, double cash) {
        this.name = name;
        this.cash = cash;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public double getCash() {
        return this.cash;
    }

    public int inventorySize() {
        return this.inventory.size();
    }
}
