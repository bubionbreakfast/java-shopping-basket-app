

import shoppingbasket.items.IItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingBasket {

    private String name;
    private int capacity;
    private List<IItem> items;
    IItem getPrice;

    public ShoppingBasket(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.items = new ArrayList<IItem>();
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IItem> getItems() {
        return items;
    }

    public void add(IItem item) {
        this.items.add(item);
    }

    public int getCount() {
        return this.items.size();
    }

    public void remove(IItem item) {
        this.items.remove(item);
    }

    public void empty() {
        this.items.clear();
    }


    public int total() {
       int basketTotal = 0;
       for(IItem item : this.items){
           basketTotal += item.getPrice();
       }
       return basketTotal;
    }

    public int buy1Get1Free() {
        int basketTotal = 0;
        items = items.stream().distinct().collect(Collectors.toList());

        for(IItem item : this.items){
            basketTotal += item.getPrice();
        }
        return basketTotal;
    }
}
