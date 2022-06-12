package Exam1;

public class Tenant
{
  private MyDate rentedFrom;
  private String name;

  public Tenant(String name) {
    rentedFrom = rentedFrom.copy();
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public MyDate getRentedFrom() {
    return rentedFrom.copy();
  }

  public void setRentedFrom(MyDate date) {
    rentedFrom.set(date.getDay(), date.getMonth(), date.getYear());
  }



}
