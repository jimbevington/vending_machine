import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("John", 10.00);
    }

    @Test
    public void canGetName() {
        assertEquals("John", customer.getName());
    }

    @Test
    public void canGetCash() {
        assertEquals(10.00, customer.getCash(), 0.01);
    }

    @Test
    public void testCustomerEmptyIsInitiallyEmpty() {
        assertEquals(0, customer.inventorySize());
    }
}
