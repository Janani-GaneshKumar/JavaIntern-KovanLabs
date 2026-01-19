package shoppingKartinJava;
import java.util.*;
public class Cart {
	private Map<Product, Integer> items = new HashMap<>();

    public void addItem(Product p, int qty) {
        items.put(p, items.getOrDefault(p, 0) + qty);
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

}

