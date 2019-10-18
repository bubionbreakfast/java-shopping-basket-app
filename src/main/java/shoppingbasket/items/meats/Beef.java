package shoppingbasket.items.meats;

import shoppingbasket.items.IItem;
import shoppingbasket.items.Item;

public class Beef extends Item implements IItem {
    public Beef(String name, int price) {
        super(name, price);
    }

    public String add(String item) {
        return null;
    }

    public int total() {
        return 0;
    }

    public int index() {
        return 0;
    }

    public int price(int item) {
        return this.getPrice();
    }
}
