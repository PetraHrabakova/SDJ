package Exercise2;

public class HeadOfDepartment extends Employee
{
  private String department;

  public HeadOfDepartment(String name, String address, double hours, double payRate, String department) {
    super(name, address, hours, payRate);
    this.department = department;
  }

  public String getDepartment()
  {
    return department;
  }

  public void setDepartment(String department)
  {
    this.department = department;
  }

  public String toString() {
    return super.toString() +
        "\nDepartment: " + department;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof HeadOfDepartment)) {
      return false;
    }
    HeadOfDepartment other = (HeadOfDepartment) obj;
    return super.equals(other) && department.equals(other.department);
  }
}
