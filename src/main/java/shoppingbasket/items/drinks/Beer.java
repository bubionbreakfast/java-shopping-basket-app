package shoppingbasket.items.drinks;

import shoppingbasket.items.IItem;
import shoppingbasket.items.Item;

public class Beer extends Item implements IItem {
    public Beer(String name, int price) {
        super(name, price);
    }

    public String add(String item) {
        return null;
    }
}
