package Model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
    private List<Observer> observers = new ArrayList<>();
    
    //state
    private String status;

    //add
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    //delete
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
    
    public String getStatus() {
        return status;
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

