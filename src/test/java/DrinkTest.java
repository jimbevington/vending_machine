import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrinkTest {

    private Drink drink;

    @Before
    public void setUp() throws Exception {
        drink = new Drink("Pepsi", 330);
    }

    @Test
    public void canGetName() {
        assertEquals("Pepsi", drink.getName());
    }


}

