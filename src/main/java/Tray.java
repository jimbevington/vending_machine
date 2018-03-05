import java.util.ArrayList;

public class Tray {

    private ArrayList<Product> stock;
    private double price;
    private int capacity;

    public Tray(double price, int capacity) {
        this.price = price;
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public double getPrice() {
        return price;
    }
}
