package ProgrammingChallenge7;

public class Customer extends Person
{
  boolean wantsOnMailingList;
  int customerNumber;

  public Customer(String name, String address, String telephone, String number, int customerNumber) {
    super(name, address, telephone, number);
    this.customerNumber = customerNumber;
    wantsOnMailingList = true;
  }

  public int getCustomerNumber()
  {
    return customerNumber;
  }

  public void setCustomerNumber(int customerNumber)
  {
    this.customerNumber = customerNumber;
  }
}
