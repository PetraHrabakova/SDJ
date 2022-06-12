package Exam6;

public class PrivilegedCustomer extends Customer
{
  private double discount;

  public PrivilegedCustomer(String name) {
    this.discount = discount;
  }

  public double getDiscount()
  {
    return discount;
  }

  public void setDiscount(double percentage)
  {
    discount = percentage;
  }
}
