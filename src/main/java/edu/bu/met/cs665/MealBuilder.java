package edu.bu.met.cs665;

public abstract class MealBuilder {
  protected Meal meal;
  
  public MealBuilder() {
    meal = new Meal();
  }
  
  public abstract MealBuilder mainCourse(String mainCourse);

  public abstract MealBuilder side(String side);
 
  public abstract MealBuilder drink(String drink);
  
  public abstract Meal build();
}
