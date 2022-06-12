package Exam6;

import java.util.ArrayList;

public class PizzaOrder
{
  private Customer customer;
  private ArrayList<Pizza> pizzas;

  public PizzaOrder(Customer customer) {
    this.customer = customer;
  }

  public Customer getCustomer()
  {
    return customer;
  }

  public int getNumberOfPizzas() {
    return pizzas.size();
  }

  public void addPizza(Pizza pizza) {
    pizzas.add(pizza);
  }

  public Pizza getPizza(int index) {
    return pizzas.get(index);
  }

  public Pizza getPizza(String pizzaName) {
    for (Pizza pizza: pizzas) {
      if (pizza.getName().equals(pizzaName)) {
        return pizza;
      }
    }
    return null;
  }

  public double getTotalPrice() {
    double totalPrice = 0;
    for (Pizza pizza: pizzas) {
      if (customer instanceof PrivilegedCustomer) {
        totalPrice += pizza.getTotalPrice() * (((PrivilegedCustomer) customer).getDiscount()/100);
      }
      else
        totalPrice += pizza.getTotalPrice();
    }
    return totalPrice;
  }
}
