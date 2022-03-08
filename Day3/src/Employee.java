public class Employee
{
  String name;
  int idNumber;
  String department;
  String position;

  public void setName(String n) {
    name = n;
  }

  public void setID(int ID) {
    idNumber = ID;
  }

  public void setDepartment(String d) {
    department = d;
  }

  public void setPosition(String p) {
    position = p;
  }

  public String getName() {
    return name;
  }

  public int getID() {
    return idNumber;
  }

  public String getDepartment() {
    return department;
  }

  public String getPosition() {
    return position;
  }
}
