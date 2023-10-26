package edu.bu.met.cs665;

public class Order {
  private Meal meal;
  
  public Order(Meal meal) {
    this.meal = meal;
  }
  
  public String getMeal() {
    return meal.toString();
  }
}

