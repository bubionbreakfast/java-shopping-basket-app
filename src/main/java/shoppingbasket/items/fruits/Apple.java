package shoppingbasket.items.fruits;

import shoppingbasket.items.IItem;
import shoppingbasket.items.Item;

public class Apple extends Item implements IItem {
    public Apple(String name, int price) {
        super(name, price);
    }

    public String add(String item) {
        return null;
    }

    public int total() {
        return 0;
    }
}
