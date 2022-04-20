package Question2;

public class EmployeeTest
{
  public static void main(String[] args)
  {
    Date date = new Date(29, 6, 1998);
    HourlyEmployee employee = new HourlyEmployee("Petra", date, 120, 200);
    EmployeeList employeeList = new EmployeeList(1);

    employeeList.addEmployee(employee);
    System.out.println(employeeList);

  }
}
