package Model;

public class Electronics extends Product {
    
	public Electronics(double price) {
        super(price);
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Electronics Product with price: $" + price);
    }
    
}
