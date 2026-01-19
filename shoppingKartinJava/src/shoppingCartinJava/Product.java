package shoppingKartinJava;
//This is a model class.It should only have attributes and Overridden Method
public class Product {
    private int id;
    private String name;
    private double price;
    private String brand;
    private int quantity;
    private String specifications; 
    public Product(int id, String name, double price, String brand, int quantity, String specifications) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
        this.specifications = specifications;}
    public int getId() {
    	return id; 
    	}
    public String getName() { 
    	return name; 
    	}
    public double getPrice() {
    	return price; 
    	}
    public String getBrand() { 
    	return brand; 
    	}
    public int getQuantity() { 
    	return quantity; 
    	}
    public String getSpecifications() { 
    	return specifications; 
    	}
    public void setQuantity(int  quantity) { 
    	this.quantity = quantity; 
    	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", quantity="
				+ quantity + ", specifications=" + specifications + "]";
	}
    
   
}
