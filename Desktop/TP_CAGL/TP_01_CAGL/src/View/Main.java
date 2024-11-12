package View;

import Controller.OrderController;
import Model.Order;



public class Main {
    public static void main(String[] args) {
        OrderView orderView = new OrderView();
        Order order = new Order();
        OrderController controller = new OrderController(orderView, order);

        // Set payment method before creating the order
        controller.setPaymentMethod("paypal");  

        // Create order
        controller.createOrder();
    }
}



