package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

public class Customer  implements Subject {
  private List<Observer> observers = new ArrayList<>();
  
  public void addObserver(Observer observer) {
    observers.add(observer);
  }
  
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }
  
  /**
   * Notifies all registered observers of a change by calling their update
   * method and passing the given order object as a parameter. This method
   * is typically called when the state of the subject (e.g., the customer's
   * order) has changed, and observers (e.g., the chef) need to be informed.
   *
   * @param order The Order object to be passed to the observers' update method.
   */
  public void notifyObservers(Order order) {
    for (Observer observer : observers) {
      observer.update(order);
    }
  }
  
  public void placeOrder(Order order) {
    notifyObservers(order);
  }
}

