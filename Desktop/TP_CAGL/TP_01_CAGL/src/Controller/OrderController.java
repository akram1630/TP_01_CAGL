package Controller;

import Model.CreditCardPayment;
import Model.Customer;
import Model.Order;
import Model.PayPalPayment;
import Model.PaymentAdapter;
import Model.Product;
import Model.ProductFactory;
import View.OrderView;

public class OrderController {
    private OrderView orderView;
    private Order order;
    private PaymentAdapter paymentAdapter;

    public OrderController(OrderView orderView, Order order) {
        this.orderView = orderView;
        this.order = order;
    }

    public void createOrder() {
        String productType = orderView.getProductType();
        double price = orderView.getProductPrice();

        Product product = ProductFactory.createProduct(productType, price);
        product.displayProductInfo();

        // Add observers (Customers)
        Customer customer = new Customer("John Doe");
        order.addObserver(customer);

        // Set order status
        order.setStatus("Order Created");

        // Process payment
        processPayment(price);

        // Set final status
        order.setStatus("Order Processed");
    }

    public void setPaymentMethod(String paymentType) {
        switch (paymentType.toLowerCase()) {
            case "paypal":
                paymentAdapter = new PayPalPayment();
                break;
            case "creditcard":
                paymentAdapter = new CreditCardPayment();
                break;
            default:
                throw new IllegalArgumentException("Invalid payment method");
        }
    }

    private void processPayment(double amount) {
        paymentAdapter.processPayment(amount);
        orderView.displayPaymentConfirmation(amount);
    }
}
