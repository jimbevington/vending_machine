import org.junit.Before;
import org.junit.Test;

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

//    can add an item to a tray

//    can remove an item

//    can't add more than capacity

}
