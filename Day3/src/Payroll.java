public class Payroll
{
  String name;
  double hourly_payrate;
  double number_of_hours;

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

}
