package Model;

                 
public class Customer implements Observer {
    
	private String name;

    public Customer(String name) {
        this.name = name;
    }
    	
    @Override
    public void update(Order order) {
        System.out.println(name + ", your order status is now: " + order.getStatus());
    }
    
}                  