package edu.bu.met.cs665;

public class Chef implements Observer {
  private String name;
  
  public Chef(String name) {
    this.name = name;
  }
  
  @Override
  public void update(Order order) {
    System.out.println("Chef " + name + " has received the order: " + order.getMeal());
  }
}
