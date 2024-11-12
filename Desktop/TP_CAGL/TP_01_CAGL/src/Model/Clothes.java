package Model;

public class Clothes extends Product {
    public Clothes(double price) {
        super(price);
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Clothing Product with price: $" + price);
    }
}

