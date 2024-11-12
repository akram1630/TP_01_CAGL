package Model;

public class Books extends Product {
    
	public Books(double price) {
        super(price);
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Book Product with price: $" + price);
    }
    
}