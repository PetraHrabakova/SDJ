package ProgrammingChallenge7;

public class Person
{
  private String name;
  private String address;
  private String telephone;
  private String number;

  public Person(String name, String address, String telephone, String number) {
    this.name = name;
    this.address = address;
    this.telephone = telephone;
    this.number = number;
  }

  public String getAddress()
  {
    return address;
  }

  public String getName()
  {
    return name;
  }

  public String getNumber()
  {
    return number;
  }

  public String getTelephone()
  {
    return telephone;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setNumber(String number)
  {
    this.number = number;
  }

  public void setTelephone(String telephone)
  {
    this.telephone = telephone;
  }
}
