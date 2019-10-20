

import shoppingbasket.items.IItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("Convert2Diamond")
public class ShoppingBasket {

    private String name;
    private int capacity;
    private ArrayList<IItem> items;
    private double over20PoundDiscountValue;
    private double basketTotal;

    public ShoppingBasket(String name, int capacity, double over20PoundDiscountValue, double basketTotal) {
        this.name = name;
        this.capacity = capacity;
        this.items = new ArrayList<IItem>();
        this.over20PoundDiscountValue = over20PoundDiscountValue;
        this.basketTotal = basketTotal;
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

    public double total() {
       double basketTotal = 0;
       for(IItem item : this.items){
           basketTotal += item.getPrice();
       }
       return basketTotal;
    }

    public void buy1Get1Free() {
        int basketTotal = 0;
        items = (ArrayList<IItem>) items.stream().distinct().collect(Collectors.toList());

        for(IItem item : this.items){
            basketTotal += item.getPrice();
        }
    }

    public double getBasketTotal(){
        double basket = 0;
        for(IItem item : this.items){
            basket += item.getPrice();
        }
        basketTotal = basket;
        if(basketTotal > 20){
            return basketTotal * over20PoundDiscountValue;
        } else
                return basketTotal;
    }

    public void setBasketTotal(double basketTotal) {
        this.basketTotal = basketTotal;
    }

//    public double over20PoundsDiscount() {
//        double basket = 0;
//        for(IItem item : this.items){
//            basket += item.getPrice() * 0.9;
//        }
//        basketTotal = basket * 0.9;
//        return basketTotal * 0.9;
//    }
}
