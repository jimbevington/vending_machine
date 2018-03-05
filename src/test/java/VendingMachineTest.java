import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    private VendingMachine vendingMachine;

    @Before
    public void setUp() throws Exception {

        HashMap<Selection, Tray> products = new HashMap<>();

        for(Selection selection : Selection.values()) {

            Tray tray = new Tray(0.50, 10);

            for (int i = 0; i < 5; i++) {
                Sweet refreshers = new Sweet("Refreshers", 10);
                tray.addItem(refreshers);
            }

            products.put(selection, tray);
        }

        vendingMachine = new VendingMachine(products, 10.00);
    }

//    check that added coins add to credit, but not cash


    @Test
    public void coinsAddToCredit() {
        vendingMachine.addMoney(0.50);
        assertEquals(0.50, vendingMachine.getCredit(), 0.01);
        assertEquals(10.00, vendingMachine.getCash(), 0.01);
    }

//    can take money out

    @Test
    public void canGiveRefund() {
        vendingMachine.addMoney(1.50);
        double refund = vendingMachine.giveRefund();
        assertEquals(1.50, refund, 0.01);
        assertEquals(0.00, vendingMachine.getCredit(), 0.01);
        assertEquals(10.00, vendingMachine.getCash(), 0.01);
    }

    @Test
    public void canGetStockLevelOfTray() {
        assertEquals(5, vendingMachine.getStockLevelForTray(Selection.A1));
    }

        @Test
    public void testVendingMachineVends__exactChange() {
        vendingMachine.addMoney(0.50);
        Product product = vendingMachine.vend(Selection.A1);
        assertEquals(4, vendingMachine.getStockLevelForTray(Selection.A1));
        assertEquals(10.50, vendingMachine.getCash(), 0.01);
        assertEquals(0.00, vendingMachine.getCredit(), 0.01);
//        assert(product instanceof Sweet);
        assertEquals("Refreshers", product.getName());

    }
}
