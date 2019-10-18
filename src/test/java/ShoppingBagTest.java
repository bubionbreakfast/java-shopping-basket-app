import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBagTest {

    ShoppingBag shoppingBag;

    @Before
    public void before(){
        shoppingBag = new ShoppingBag("Cams Bag", 9);
    }

    @Test
    public void hasName(){
        assertEquals("Cams Bag",shoppingBag.getName());
    }
}
