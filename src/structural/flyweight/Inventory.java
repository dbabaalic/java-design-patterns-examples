package structural.flyweight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

    private Catalog catalog = new Catalog();

    private List<Order> orders = new ArrayList<Order>();

    public void takeOrder(String itemName, String orderNumber){
        Item item = catalog.lookup(itemName);
        orders.add(new Order(orderNumber, item));
    }

    public void processOrders() {
        Iterator iterator = orders.iterator();
        while (iterator.hasNext()){
            System.out.println("Processing order : "+iterator.next());
            iterator.remove();
        }
    }

    public void report() {
        System.out.println("Number of items is " + catalog.getCatalogSize());
    }
}
