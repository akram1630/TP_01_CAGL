package View;

import java.util.Scanner;

public class OrderView {
    private Scanner scanner = new Scanner(System.in);

    public String getProductType() {
        System.out.print("Enter product type (electronics, clothes, books): ");
        return scanner.nextLine();
    }

    public double getProductPrice() {
        System.out.print("Enter product price: ");
        return scanner.nextDouble();
    }

    public void displayOrderStatus(String status) {
        System.out.println("Order status: " + status);
    }

    public void displayPaymentConfirmation(double amount) {
        System.out.println("Payment of $" + amount + " has been processed.");
    }
}

