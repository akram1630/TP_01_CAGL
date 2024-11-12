package Model;

public abstract class Product {
    
	protected double price;
    
    public Product(double price) {
        this.price = price;
    }

    public abstract void displayProductInfo();
    
    public double getPrice() {
        return price;
    }
}

