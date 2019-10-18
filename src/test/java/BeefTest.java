import org.junit.Before;
import org.junit.Test;
import shoppingbasket.items.meats.Beef;

import static org.junit.Assert.assertEquals;

public class BeefTest {

    Beef beef;

    @Before()
    public void before(){
        beef = new Beef("steak", 4);
    }

    @Test
    public void hasName(){
        assertEquals("steak", beef.getName());
    }

    @Test
    public void hasPrice(){
        assertEquals(4, beef.getPrice());
    }


}
