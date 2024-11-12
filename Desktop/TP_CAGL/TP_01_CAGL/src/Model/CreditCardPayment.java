package Model;

public class CreditCardPayment implements PaymentAdapter {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }
}
