package edu.bu.met.cs665;

public class Meal {
  private String mainCourse;
  private String side;
  private String drink;
  
  public String getMainCourse() {
    return mainCourse;
  }
  
  public void setMainCourse(String mainCourse) {
    this.mainCourse = mainCourse;
  }
  
  public String getSide() {
    return side;
  }
  
  public void setSide(String side) {
    this.side = side;
  }
  
  public String getDrink() {
    return drink;
  }
  
  public void setDrink(String drink) {
    this.drink = drink;
  }
  
  @Override
  public String toString() {
    return "Meal [mainCourse=" + mainCourse + ", side=" + side + ", drink=" + drink + "]";
  }
}
