package shoppingbasket.items.meats;

import shoppingbasket.items.IItem;
import shoppingbasket.items.Item;

public class Chicken extends Item implements IItem {
    public Chicken(String name, int price) {
        super(name, price);
    }

    public String add(String item) {
        return null;
    }

    public int total() {
        return 0;
    }
}
