package Model;

public class ProductFactory {
    public static Product createProduct(String type, double price) {
        switch (type.toLowerCase()) {
            case "electronics":
                return new Electronics(price);
            case "clothes":
                return new Clothes(price);
            case "books":
                return new Books(price);
            default:
                throw new IllegalArgumentException("Unknown product type");
        }
    }
}

