package Question2;

public abstract class Employee
{
  private String name;
  private Date birthday;

  public Employee(String name, Date birthday) {
    this.birthday = birthday.copy();
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public Date getBirthday()
  {
    return birthday;
  }

  public String toString() {
    return "Name: " + name + " | " + birthday;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Employee)) {
      return false;
    }
    Employee other = (Employee)obj;
    return name.equals(other.name);
  }

  // Abstract method
  public abstract double earningsPerWeek();
}
