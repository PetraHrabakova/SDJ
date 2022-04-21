package Model;

import java.io.Serializable;

public class Car implements Serializable
{
  private Owner owner;
  private String regNumber;
  private String make;
  private String model;
  private int year;

  public Car(Owner owner, String regNumber, String make, String model, int year) {
    this.owner = owner;
    this.regNumber = regNumber;
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public String getRegNumber()
  {
    return regNumber;
  }

  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public int getYear()
  {
    return year;
  }

  public String toString() {
    return "Registration number: " + regNumber + " | Make: " + make +
        " | Model: " + model + " | Year: " + year + owner;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Car)) {
      return false;
    }
    Car other = (Car) obj;
    return regNumber.equals(other.regNumber) && make.equals(other.make)
        && model.equals(other.model) && year == other.year;
  }

}
