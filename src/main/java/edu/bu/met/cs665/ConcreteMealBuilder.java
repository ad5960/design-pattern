package edu.bu.met.cs665;

public class ConcreteMealBuilder extends MealBuilder {
  @Override
  public MealBuilder mainCourse(String mainCourse) {
    meal.setMainCourse(mainCourse);
    return this;
  }
  
  @Override
  public MealBuilder side(String side) {
    meal.setSide(side);
    return this;
  }
  
  @Override
  public MealBuilder drink(String drink) {
    meal.setDrink(drink);
    return this;
  }
  
  @Override
  public Meal build() {
    return meal;
  }
}

