package shoppingbasket.items;

import shoppingbasket.items.Item;

public interface IItem {

    String add(String item);

    int total();

    int getPrice();

    String getName();

    int index();

    double setTotal(double total);
}
