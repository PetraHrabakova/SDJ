package Question2;

import java.util.ArrayList;

public class EmployeeList
{
  private int size;
  ArrayList<Employee> employees;

  public EmployeeList(int maxNumberOfEmployees) {
    employees = new ArrayList<>();
    size = maxNumberOfEmployees;
  }

  public void addEmployee(Employee employee) {
    if(employees.size() < size) {
      employees.add(employee);
    }
  }

  public void removeEmployee(Employee employee) {
    employees.remove(employee);
  }

  public int getNumberOfEmployees() {
    return employees.size();
  }

  public Employee[] getAllEmployees() {
    Employee[] newEmployees = new Employee[getNumberOfEmployees()];
    return employees.toArray(newEmployees);
  }

  public double getTotalEarningsPerWeek()
  {
    int total = 0;
    for (int i = 0; i < employees.size(); i++)
    {
      if (employees.get(i) instanceof HourlyEmployee || employees.get(i) instanceof SalariedEmployee)
      {
        total += employees.get(i).earningsPerWeek();
      }
    }
    return total;
  }

  public String toString() {
    String str = "";

    for (int i = 0; i < employees.size(); i++) {
      str += employees.get(i);
    }
    return str;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof EmployeeList)) {
      return false;
    }
    EmployeeList other = (EmployeeList) obj;
    return employees.equals(other.employees);
  }
}

