package shoppingKartinJava;
import java.util.*;
public class ProductService {
    private Product mapToProduct(Map<String, Object> data) {
        if (data == null) return null;
        int id = (int) data.get("id");
        String name = (String) data.get("name");
        double price =(double) data.get("price");
        String brand =(String) data.get("brand");
        int quantity =(int) data.get("quantity");
        String specs =(String) data.get("specifications");
        return new Product(id, name, price, brand, quantity, specs);
    }
    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        for (Map<String, Object> prodMap : ProductDatabase.productMap.values()) {
            list.add(mapToProduct(prodMap));
        }
        return list;
    }   
    public Product getProductById(int id) {
        Map<String, Object> prodData = ProductDatabase.productMap.get(id);
        return mapToProduct(prodData);
    }
    public boolean reduceQuantity(int id, int qty) {
        Map<String, Object> prodData = ProductDatabase.productMap.get(id);
        if (prodData == null)
        	return false;
        int available = (int)prodData.get("quantity");
        if (available >= qty) {
            prodData.put("quantity", available - qty); 
            return true;
        }
        return false;
    }
    public void displayAllProducts() {
        for (Map.Entry<Integer, Map<String, Object>> entry : ProductDatabase.productMap.entrySet()) {
            System.out.println(mapToProduct(entry.getValue()));
            System.out.println("------------------------------------------------");
        }
    }
    public List<Product> searchProducts(String keyword) {
        keyword = keyword.toLowerCase();
        List<Product> results = new ArrayList<>();
        for (Map.Entry<Integer, Map<String, Object>> entry : ProductDatabase.productMap.entrySet()) {
            Product p = mapToProduct(entry.getValue());
            if (p.getName().toLowerCase().contains(keyword)) {
                results.add(p);
            }
        }
        return results;
    }
}
