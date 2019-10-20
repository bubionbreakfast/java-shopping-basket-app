import org.junit.Before;
import org.junit.Test;
import shoppingbasket.items.drinks.Beer;
import shoppingbasket.items.fruits.Apple;
import shoppingbasket.items.meats.Beef;
import shoppingbasket.items.meats.Chicken;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Beer beer;
    Beef beef;
    Apple apple;
    Chicken chicken;
    private static final double DELTA = 0.01;


    @Before
    public void before(){
        beef = new Beef("Steak", 5);
        beer = new Beer("PunkIPA", 3);
        apple = new Apple("Cox", 1);
        chicken = new Chicken("roast", 15);

        shoppingBasket = new ShoppingBasket("Daves Basket", 10, 0.9,  0, false);
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, shoppingBasket.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Daves Basket", shoppingBasket.getName());
    }

    @Test
    public void basketStartsEmpty(){
        assertEquals(0, shoppingBasket.getCount());
    }

    @Test
    public void canAddItem(){
        shoppingBasket.add(beer);
        shoppingBasket.add(beef);
        assertEquals(2, shoppingBasket.getCount());
    }

    @Test
    public void canRemoveItem(){
        shoppingBasket.remove(beer);
        shoppingBasket.add(apple);
        shoppingBasket.add(beef);
        assertEquals(2, shoppingBasket.getCount());
    }

    @Test
    public void canEmptyBasket(){
        shoppingBasket.add(apple);
        shoppingBasket.add(beef);
        shoppingBasket.empty();
        assertEquals(0, shoppingBasket.getCount());
    }

    @Test
    public void canGetBasketTotal(){
        shoppingBasket.add(beef);
        shoppingBasket.add(apple);
        shoppingBasket.add(beer);
        assertEquals(9, shoppingBasket.getBasketTotal(),DELTA);
    }

    @Test
    public void canApplyBuy1Get1FreeDiscount(){
        shoppingBasket.add(beer);
        shoppingBasket.add(beer);
        shoppingBasket.add(beef);
        shoppingBasket.add(apple);
        shoppingBasket.buy1Get1Free();
        assertEquals(9, shoppingBasket.getBasketTotal(),DELTA);
    }

    @Test
    public void canGetCalaculatedTotal(){
        assertEquals(5, shoppingBasket.getBasketTotal(),DELTA);
    }

    @Test
    public void canSetCalculatedTotal(){
        shoppingBasket.setBasketTotal(12);
        assertEquals(12, shoppingBasket.getBasketTotal(),DELTA);
    }

//    @Test
//    public void canSetCalculatedTotalByDiscount(){
//        shoppingBasket.discount1();
//        assertEquals(12, shoppingBasket.getCalculatedTotal());
//    }

    @Test
    public void canApply10PercentOffOnTotalOver20(){
        shoppingBasket.add(beer);
        shoppingBasket.add(beef);
        shoppingBasket.add(apple);
        shoppingBasket.add(beef);
        shoppingBasket.add(chicken);
        shoppingBasket.buy1Get1Free();
        assertEquals(21.168,shoppingBasket.getCardDiscount(), DELTA);
    }
}
