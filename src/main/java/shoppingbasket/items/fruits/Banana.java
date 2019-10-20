package shoppingbasket.items.fruits;

import shoppingbasket.items.IItem;
import shoppingbasket.items.Item;

public class Banana extends Item implements IItem {
    public Banana(String name, int price) {
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


}
