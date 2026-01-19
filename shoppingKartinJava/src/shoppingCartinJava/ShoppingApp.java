package shoppingKartinJava;
import java.util.*;
public class ShoppingApp {
	public static void main(String args[]) {
	       try (Scanner in = new Scanner(System.in)) {
			UserService userService = new UserService();
	        System.out.print("Enter username: ");
	        String username = in.nextLine().toLowerCase();
	        User user = userService.findUser(username);
	        if (user != null) {
	            System.out.print("Enter password: ");
	            String password = in.nextLine();
	            if (password.equals(user.getPassword())) {
	                System.out.println("Login successful! Welcome " + user.getUsername());
	            } else {
	                System.out.println("Incorrect password! Exiting.");
	                return;
	            }}
	        else {
	            System.out.println("User not found. Registering new user...");
	            System.out.print("Enter email: ");
	            String email = in.nextLine();
	            System.out.print("Enter password: ");
	            String password = in.nextLine();
	            user = userService.registerUser(username, email, password);
	            System.out.println("Registration successful! Welcome " + user.getUsername());
	        } 
	        ProductService productService = new ProductService();
	        Cart cart = new Cart();
	        CartService cartService = new CartService();

	        while (true) {
	            System.out.println("\n===== Shopping Menu =====");
	            System.out.println("1. View Products");
	            System.out.println("2. Add to Cart");
	            System.out.println("3. View Cart");
	            System.out.println("4. Search Products");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = in.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.println("\n===== Available Products =====");
	                    productService.displayAllProducts();
	                    break;

	                case 2:
	                    System.out.print("Enter Product ID to add: ");
	                    int id = in.nextInt();

	                    Product selected = productService.getProductById(id);

	                    if (selected == null) {
	                        System.out.println("Product not found!");
	                        break;
	                    }

	                    System.out.print("Enter quantity: ");
	                    int qty = in.nextInt();

	                    if (qty <= 0) {
	                        System.out.println("Invalid quantity!");
	                        break;
	                    }
	                    boolean ok = productService.reduceQuantity(id, qty);

	                    if (ok) {
	                        cartService.addToCart(cart, selected, qty);
	                        System.out.println(selected.getName() + " added to cart (" + qty + ")");
	                    } else {
	                        System.out.println("Not enough stock available!");
	                    }
	                    break;
	                case 3:
	                    cartService.viewCart(cart);
	                    System.out.println("Total Price: ₹ " + cartService.calculateTotal(cart));
	                    break;
	                case 4:
	                    System.out.print("Enter product name or keyword to search: ");
	                    in.nextLine();
	                    String key = in.nextLine();

	                    List<Product> found = productService.searchProducts(key);

	                    if (found.isEmpty()) {
	                        System.out.println("No products found for: " + key);
	                    } else {
	                        System.out.println("\n--- Search Results ---");
	                        for (Product pSearch : found) {
	                            System.out.println(pSearch);
	                            System.out.println("-----------------------------");
	                        }
	                    }
	                    break;
	                case 5:
	                    System.out.println("Exiting......");
	                    System.out.println("Thank You For Shopping!");
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice.");
	            }
		   }
	    }
	}}
