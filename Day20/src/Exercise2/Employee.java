package Exercise2;

import Exercise1.Bicycle;

public class Employee extends Person
{
  private double hours;
  private double payRate;

  public Employee(String name, String address, double hours, double payRate) {
    super(name, address);
    this.hours = hours;
    this.payRate = payRate;
  }

  public double getHours()
  {
    return hours;
  }

  public double getPayRate()
  {
    return payRate;
  }

  public void setHours(double hours)
  {
    this.hours = hours;
  }

  public void setPayRate(double payRate)
  {
    this.payRate = payRate;
  }

  public double getSalary() {
    return payRate * hours;
  }

  public String toString() {
    return super.toString() +
        "\nHours: " + hours +
        "\nPay rate: " + payRate;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Employee)) {
      return false;
    }
    Employee other = (Employee) obj;
    return super.equals(other) && hours == other.hours && payRate == other.payRate;
  }
}
