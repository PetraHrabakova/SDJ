package Question2;

public class HourlyEmployee extends Employee
{
  private double wagePerHour;
  private double hoursWorkedPerWeek;

  public HourlyEmployee(String name, Date birthday, double wagePerHour, double hoursWorkedPerWeek) {
    super(name, birthday);
    this.wagePerHour = wagePerHour;
    this.hoursWorkedPerWeek = hoursWorkedPerWeek;
  }

  public void setWagePerHour(double wagePerHour)
  {
    this.wagePerHour = wagePerHour;
  }

  public double getWagePerHour()
  {
    return wagePerHour;
  }

  public void setHoursWorkedPerWeek(double hoursWorkedPerWeek)
  {
    this.hoursWorkedPerWeek = hoursWorkedPerWeek;
  }

  public double getHoursWorkedPerWeek()
  {
    return hoursWorkedPerWeek;
  }

  public double earningsPerWeek() {
    return wagePerHour * hoursWorkedPerWeek;
  }


  public String toString() {
    return super.toString() + "\nWage per hour: " + wagePerHour +
        "\nHours worked per week: " + hoursWorkedPerWeek;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof HourlyEmployee)) {
      return false;
    }
    HourlyEmployee other = (HourlyEmployee) obj;
    return super.equals(other) && wagePerHour == other.wagePerHour && hoursWorkedPerWeek == other.hoursWorkedPerWeek;
  }
}
