package Exam1;

import java.util.ArrayList;

public abstract class Residence
{
  private MyDate rentedFrom;
  private Tenant rentedTo;
  private int number;
  private double size;
  private String type;

  public Residence(int number, double size, String type) {
    this.number = number;
    this.size = size;
    this.type = type;
    rentedTo = null;
  }

  public int getNumber()
  {
    return number;
  }

  public double getSize()
  {
    return size;
  }

  public String getType()
  {
    return type;
  }

  public boolean isAvailable() {
    if (rentedTo == null) {
      return false;
    }
    else
      return true;
  }

  public void rentTo(Tenant tenant, MyDate rentedFrom) {
    this.rentedFrom = rentedFrom;
    this.rentedTo = tenant;
  }

  public Tenant getTenant() {
    return rentedTo;
  }

  public abstract int getNumberOfRooms();
}
