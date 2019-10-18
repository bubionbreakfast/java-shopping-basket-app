import shoppingbasket.items.IItem;

import java.util.ArrayList;

public class ShoppingBag {

    private String name;
    private int capacity;
    private ArrayList<IItem> items;

    public ShoppingBag(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.items = new ArrayList<IItem>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
