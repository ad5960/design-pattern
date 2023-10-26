package edu.bu.met.cs665;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RestaurantOrderingSystem {
  
  /**
   * The entry point for the RestaurantOrderSystem application. This method demonstrates
   * the usage of the Builder and Observer design patterns in a restaurant ordering system.
   * It initializes the menu, allows the user to place an order, and simulates the
   * interaction between the customer and chef as the order is prepared and completed.
   *
   * @param args The command-line arguments. Currently not used in this implementation.
   */
  public static void main(String[] args) {
    // Create a new chef
    Chef chef = new Chef("Ayush");
    
    // Create a new customer and register the chef as an observer
    Customer customer = new Customer();
    customer.addObserver(chef);
    
    // Get the menu instance
    Menu menu = Menu.getInstance();
    
    // Get the user's order
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to our restaurant! Please choose from the menu:");
    
    System.out.println("\nMain Courses:");
    for (int i = 0; i < menu.getMainCourses().length; i++) {
      System.out.println((i + 1) + ". " + menu.getMainCourses()[i]);
    }
    System.out.print("Enter the number of your choice: ");
    int mainCourseChoice = scanner.nextInt() - 1;
    
    System.out.println("\nSides:");
    for (int i = 0; i < menu.getSides().length; i++) {
      System.out.println((i + 1) + ". " + menu.getSides()[i]);
    }
    System.out.print("Enter the number of your choice: ");
    int sideChoice = scanner.nextInt() - 1;
    
    System.out.println("\nDrinks:");
    for (int i = 0; i < menu.getDrinks().length; i++) {
      System.out.println((i + 1) + ". " + menu.getDrinks()[i]);
    }
    System.out.print("Enter the number of your choice: ");
    int drinkChoice = scanner.nextInt() - 1;
    
    // Create a meal using the MealDirector and CustomMealBuilder
    MealBuilder mealBuilder = new ConcreteMealBuilder();
    MealDirector mealDirector = new MealDirector(mealBuilder);
    
    
    Meal meal = mealDirector.constructMeal(menu.getMainCourses()[mainCourseChoice],
        menu.getSides()[sideChoice],
        menu.getDrinks()[drinkChoice]);
    
    // Create an order with the meal
    Order order = new Order(meal);
    
    // The customer places the order
    customer.placeOrder(order);
    
    // Order preparation simulation
    try {
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Order is being prepared...");
      TimeUnit.SECONDS.sleep(3);
      System.out.println("Order prepared!");
      TimeUnit.SECONDS.sleep(3);
      System.out.println("Thank you for eating at our restaurant!");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
