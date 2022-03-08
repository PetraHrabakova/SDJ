public class EmployeeDemo
{
  public static void main(String[] args)
  {
    Employee employee1 = new Employee();
    Employee employee2 = new Employee();
    Employee employee3 = new Employee();

    // Employee 1
    employee1.setName("Susan Meyers");
    employee1.setID(47899);
    employee1.setDepartment("Accounting");
    employee1.setPosition("Vice President");

    // Employee 2
    employee2.setName("Mark Jones");
    employee2.setID(39119);
    employee2.setDepartment("IT");
    employee2.setPosition("Programmer");

    // Employee 3
    employee3.setName("Joy Rogers");
    employee3.setID(81771);
    employee3.setDepartment("Manufacturing");
    employee3.setPosition("Engineer");

    // Print all information
    System.out.println("Information about Employee 1");
    System.out.println("Name: " + employee1.getName());
    System.out.println("ID: " + employee1.getID());
    System.out.println("Department: " + employee1.getDepartment());
    System.out.println("Position: " + employee1.getPosition());
    System.out.println();

    System.out.println("Information about Employee 2");
    System.out.println("Name: " + employee2.getName());
    System.out.println("ID: " + employee2.getID());
    System.out.println("Department: " + employee2.getDepartment());
    System.out.println("Position: " + employee2.getPosition());
    System.out.println();

    System.out.println("Information about Employee 3");
    System.out.println("Name: " + employee3.getName());
    System.out.println("ID: " + employee3.getID());
    System.out.println("Department: " + employee3.getDepartment());
    System.out.println("Position: " + employee3.getPosition());
    System.out.println();

  }
}
