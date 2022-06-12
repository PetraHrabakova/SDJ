package Exam4;

import java.util.ArrayList;

public abstract class Car
{
  private String licenseNo;
  private double price;
  private Customer rentedTo;

  public Car(String licenseNo, double price) {
    this.licenseNo = licenseNo;
    this.price = price;
    rentedTo = null;
  }

  public String getLicenseNo()
  {
    return licenseNo;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public Customer getRentedTo()
  {
    return rentedTo;
  }

  public void setRentedTo(Customer rentedTo)
  {
    this.rentedTo = rentedTo;
  }

  public boolean isAvailable() {
    return rentedTo == null;
  }

  public abstract String getType();
}
