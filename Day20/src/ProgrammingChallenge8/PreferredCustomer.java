package ProgrammingChallenge8;

import ProgrammingChallenge7.Customer;

public class PreferredCustomer extends Customer
{
  double price;

  public PreferredCustomer(String name, String address, String telephone, String number, int customerNumber) {
    super(name, address, telephone, number, customerNumber);
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public void calculateDiscount(double price) {
    if (price >= 500 && price < 1000) {
      price*=0.95;
    }
    else if (price >= 1000 && price < 1500) {
      price*=0.94;
    }
    else if (price >= 1500 && price < 2000) {
      price*=0.93;
    }
    else if (price >= 2000) {
      price*=0.90;
    }
  }
}
