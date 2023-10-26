package edu.bu.met.cs665;

public class Menu {
  private static Menu instance;
  
  private String[] mainCourses = {"Steak", "Burger", "Pizza", "Pasta", "Salad"};
  private String[] sides = {"Fries", "Onion Rings", "Garlic Bread", "Mashed Potatoes", "Coleslaw"};
  private String[] drinks = {"Coke", "Pepsi", "Sprite", "Water", "Lemonade"};
  
  private Menu() {}
  
  /**
   * Returns the singleton instance of the Menu class. If no instance exists,
   * it creates one and returns it. This ensures that only a single instance
   * of the menu exists throughout the application.
   *
   * @return The singleton instance of the Menu class.
   */
  public static Menu getInstance() {
    if (instance == null) {
      instance = new Menu();
    }
    return instance;
  }
  
  public String[] getMainCourses() {
    return mainCourses;
  }
  
  public String[] getSides() {
    return sides;
  }
  
  public String[] getDrinks() {
    return drinks;
  }
}

