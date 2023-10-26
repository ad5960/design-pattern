package edu.bu.met.cs665;

public class MealDirector {
  private MealBuilder mealBuilder;
  
  public MealDirector(MealBuilder mealBuilder) {
    this.mealBuilder = mealBuilder;
  }
  
  /**
   * Constructs a Meal object using the specified main course, side, and drink.
   * This method calls the appropriate methods of the MealBuilder to set each
   * part of the meal and then builds and returns the final Meal object.
   *
   * @param mainCourse The main course for the meal.
   * @param side       The side for the meal.
   * @param drink      The drink for the meal.
   * @return The constructed Meal object containing the specified main course, side, and drink.
   */
  public Meal constructMeal(String mainCourse, String side, String drink) {
    mealBuilder.mainCourse(mainCourse);
    mealBuilder.side(side);
    mealBuilder.drink(drink);
    return mealBuilder.build();
  }
}