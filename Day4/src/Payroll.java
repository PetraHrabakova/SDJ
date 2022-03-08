public class Payroll
{
  String name;
  double hourly_payrate;
  double number_of_hours;

  public Payroll(String name, double hourly_payrate, double number_of_hours) {
    this.name = name;
    this.hourly_payrate = hourly_payrate;
    this.number_of_hours = number_of_hours;
  }

  public Payroll() {
    name = "Petra Hrabakova";
    hourly_payrate = 120.00;
    number_of_hours = 20;
  }

  public void setName(String n) {
    name = n;
  }

  public void setPayrate(double payrate) {
    hourly_payrate = payrate;
  }

  public void setNumberOfHours(double hours) {
    number_of_hours = hours;
  }

  public String getName() {
    return name;
  }

  public double getPayrate() {
    return hourly_payrate;
  }

  public double getNumberOfHours() {
    return number_of_hours;
  }

  public double grossPay() {
    return hourly_payrate * number_of_hours;
  }

  public String toString() {
    return "Name = " + name + "Hourly Pay Rate = " + hourly_payrate +
        "Number of Hours = " + number_of_hours;
  }
}
