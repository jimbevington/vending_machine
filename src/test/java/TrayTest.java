import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrayTest {

    private Tray tray;

    @Before
    public void setUp() throws Exception {
        tray = new Tray(0.50, 10);
    }

//    trays have a price

    @Test
    public void trayPrice() {
        assertEquals(0.50, tray.getPrice(), 0.01);
    }

//    can report no. of items

    @Test
    public void name() {
        assertEquals(0, tray.getStockLevel());
    }

//    can add an item to a tray

    @Test
    public void canAddItem() {
        Drink drink = new Drink("Ice Tea", 500);
        tray.addItem(drink);
        assertEquals(1, tray.getStockLevel());
    }

//    can remove an item

    @Test
    public void testTrayEjectsItem() {
        Drink drink1 = new Drink("Ice Tea", 500);
        Drink drink2 = new Drink("Ice Tea", 500);
        tray.addItem(drink1);
        tray.addItem(drink2);
        Product ejectedProduct = tray.ejectProduct();
        assertEquals(ejectedProduct, drink1);
    }


//    can't add more than capacity


    @Test
    public void testTrayCapacityCantBeBreached() {
        for (int i = 0; i < 11; i++) {
            Drink drink = new Drink("Irn Bru", 330);
            tray.addItem(drink);
        }
        assertEquals(10, tray.getStockLevel());
    }
}
