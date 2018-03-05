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

//    can't add more than capacity

}
