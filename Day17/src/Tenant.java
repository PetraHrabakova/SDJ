public class Tenant
{
  String name;
  String phone;
  double rentDue;

  public Tenant(String name, String phone) {
    this.name = name;
    this.phone = phone;
    rentDue = 0;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setPhone(String phone)
  {
    this.phone = phone;
  }

  public void setRentDue(double rentDue)
  {
    this.rentDue = rentDue;
  }

  public String getName()
  {
    return name;
  }

  public String getPhone()
  {
    return phone;
  }

  public double getRentDue()
  {
    return rentDue;
  }

  public Tenant copy(String name, String phone) {
    Tenant newTenant = new Tenant(name, phone);
    return newTenant;
  }

  public String toString() {
    return "Name: " + name +
        "\nPhone: " + phone +
        "\nRent due: " + rentDue;
  }
}
