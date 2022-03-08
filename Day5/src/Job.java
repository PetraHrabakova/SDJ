public class Job
{
  String title;
  double salary;
  Person employee;

  public Job(String title, double salary, Person employee) {
    this.title = title;
    this.salary = salary;
    this.employee = employee;
  }

  public Job(String title, double salary) {
    this.title = title;
    this.salary = salary;
    employee = null;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void setEmployee(Person employee) {
    this.employee = employee;
  }

  public String getTitle() {
    return title;
  }

  public double getSalary() {
    return salary;
  }

  public Person getEmployee() {
    return employee;
  }

  public double givePercentageRaise(double percentage) {
    return salary + salary*(percentage/100);
  }

}
