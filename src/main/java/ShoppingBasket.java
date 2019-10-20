

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
    private boolean card;

    public ShoppingBasket(String name, int capacity, double over20PoundDiscountValue, double basketTotal, boolean card) {
        this.name = name;
        this.capacity = capacity;
        this.items = new ArrayList<IItem>();
        this.over20PoundDiscountValue = over20PoundDiscountValue;
        this.basketTotal = basketTotal;
        this.card = card;
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

    public double getCardDiscount(){
//        double basket = 0;
//        for(IItem item : this.items){
//            basket += item.getPrice();
//        }
//        basketTotal = basket;
        basketTotal = getBasketTotal();

        if(card = !true){
            return basketTotal * 1;
        } else
            return basketTotal * 0.98;
    }

    public void setBasketTotal(double basketTotal) {
        this.basketTotal = basketTotal;
    }


}
