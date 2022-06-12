package Exam6;

import java.util.ArrayList;

public class Pizza
{
  private String name;
  private double initialPrice;
  private int numberOfToppings;
  private static int MAX_NUMBER_OF_TOPPINGS = 5;
  private ArrayList<Topping> toppings;

  public Pizza(String name, double initialPrice) {
    this.name = name;
    this.initialPrice = initialPrice;
    toppings = new ArrayList<>(MAX_NUMBER_OF_TOPPINGS);
    numberOfToppings = 0;
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfToppings() {
    return toppings.size();
  }

  public void addTopping(Topping topping) {
    if (toppings.size() < MAX_NUMBER_OF_TOPPINGS) {
      toppings.add(topping);
    }
  }

  public void removeTopping(String toppingName) {
    for (Topping topping: toppings) {
      if (topping.getName().equals(toppingName)) {
        toppings.remove(topping);
      }
    }
  }

  public double getTotalPrice() {
    double totalPrice = 0;
    for (Topping topping: toppings) {
      totalPrice += topping.getPrice();
    }
    return totalPrice;
  }
}
