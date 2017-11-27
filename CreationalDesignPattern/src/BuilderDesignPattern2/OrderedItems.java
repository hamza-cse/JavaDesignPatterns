/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderDesignPattern2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amir
 */
public class OrderedItems {

    List<Item> items = new ArrayList();

    public void addItems(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item is:" + item.name());
            System.out.println("Size is:" + item.size());
            System.out.println("Price is:" + item.price());
             System.out.println();
        }
    }
}
