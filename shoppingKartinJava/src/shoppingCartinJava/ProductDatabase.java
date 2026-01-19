package shoppingKartinJava;
import java.util.*;
public class ProductDatabase {
    public static Map<Integer, Map<String, Object>> productMap = new HashMap<>();
    static {
        add(101, "T-Shirt", 799, "Max", 50, "Size:S, Colour:Red");
        add(102, "Jeans", 1599, "Levis", 30, "Size:32, Fit:Regular");
        add(103, "Formal Shirt", 1299, "Peter England", 40, "Size:M, Colour:Blue");
        add(104, "Sneakers", 2499, "Puma", 25, "Colour:White, Size:8");
        add(105, "Hoodie", 1999, "HRX", 20, "Size:L, Colour:Black");
        add(106, "Jacket", 2999, "Wildcraft", 15, "Size:M, Waterproof");
        add(107, "Smartphone", 15999, "Samsung", 15, "4GB RAM, 64GB Storage");
        add(108, "Laptop", 45999, "HP", 10, "i5, 8GB RAM, 512GB SSD");
        add(109, "Smartwatch", 2999, "Noise", 20, "Heart-rate, GPS");
        add(110, "Bluetooth Earbuds", 1499, "Boat", 35, "Battery: 20hrs");
        add(111, "Washing Machine", 19999, "LG", 10, "7kg, Fully Automatic");
        add(112, "Refrigerator", 23999, "Whirlpool", 12, "260L, Double Door");
        add(113, "LED TV", 28999, "Sony", 8, "43 inch, 4K HDR");
        add(114, "Microwave", 7999, "Samsung", 14, "23L Convection");
        add(115, "Rice 10kg", 599, "IndiaGate", 100, "Type: Basmati");
        add(116, "Milk 1L", 45, "Aavin", 200, "Toned Milk");
        add(117, "Bread", 35, "Modern", 150, "Whole Wheat");
        add(118, "Eggs Pack 12", 65, "FarmFresh", 80, "Organic");
        add(119, "Cooking Oil 1L", 120, "Fortune", 50, "Sunflower");
        add(120, "Sugar 1kg", 45, "Udhayam", 120, "White Sugar");
        add(121, "Chips", 20, "Lays", 200, "Green Chilli");
        add(122, "Soap", 35, "Lux", 60, "Rose Fragrance");
        add(123, "Shampoo 180ml", 120, "Sunsilk", 40, "Anti-dandruff");
        add(124, "Coffee Powder 200g", 150, "Bru", 45, "Strong Blend");
        add(125, "Tea Powder 250g", 160, "Tata", 35, "Premium Dust");
     }
private static void add(int id, String name, double price, String brand, int quantity, String specs) {
        Map<String, Object> details = new HashMap<>();
        details.put("id", id);
        details.put("name", name);
        details.put("price", price);
        details.put("brand", brand);
        details.put("quantity", quantity);
        details.put("specifications", specs);
        productMap.put(id, details);
    }
}
