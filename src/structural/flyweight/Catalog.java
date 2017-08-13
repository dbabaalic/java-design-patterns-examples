package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {

    private Map<String, Item> catalog = new HashMap<String, Item>();

    public Item lookup(String itemName) {
        if(!catalog.containsKey(itemName)) {
            catalog.put(itemName, new Item(itemName));
        }
        return catalog.get(itemName);
    }

    public int getCatalogSize() {
        return catalog.size();
    }
}
