package shoppingKartinJava;
public class CartService {
	// Add product to cart
    public void addToCart(Cart cart, Product p, int qty) {
        cart.addItem(p, qty);
        System.out.println(qty + " x " + p.getName() + " added to cart.");
    }
    // View cart items
    public void viewCart(Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("\n--------- Your Cart ---------");
        for (var entry : cart.getItems().entrySet()) {
            Product p = entry.getKey();
            int qty = entry.getValue();
            System.out.println("Product: " + p.getName());
            System.out.println("Quantity: " + qty);
            System.out.println("Price: ₹" + p.getPrice());
            System.out.println("-----------------------------");
        }
    }
    // Calculate total price
    public double calculateTotal(Cart cart) {
        double total = 0;

        for (var entry : cart.getItems().entrySet()) {
            Product p = entry.getKey();
            int qty = entry.getValue();
            total += p.getPrice() * qty;
        }
        return total;
    }
}
