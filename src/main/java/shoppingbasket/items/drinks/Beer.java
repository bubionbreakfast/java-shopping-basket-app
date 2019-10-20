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

    public int total() {
        return 0;
    }

    public int index() {
        return 0;
    }

    public double setTotal(double total) {
        return 0;
    }

    public double setTotal(int total) {
        return 0;
    }


    public double setTotal() {
        return 0;
    }
}
