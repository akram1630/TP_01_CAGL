package Model;

public class PayPalPayment implements PaymentAdapter {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
