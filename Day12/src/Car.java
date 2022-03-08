public class Car
{
  String make;
  String model;
  String color;
  String licenseNumber;
  int year;

  public Car(String make, String model, String color, String licenseNumber, int year)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = licenseNumber;
    this.year = year;
  }

  public Car(String make, String model, String color, int year)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.year = year;
    licenseNumber = null;
  }

  public String getModel()
  {
    return model;
  }

  public String getMake()
  {
    return make;
  }

  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  public String getColor()
  {
    return color;
  }

  public int getYear()
  {
    return year;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public void setLicenseNumber(String licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }

  public Car copy()
  {
    Car obj = new Car(make, model, color, licenseNumber, year);
    return obj;
  }

  public boolean equals(Car obj)
  {
    return make.equals(obj.make) && model.equals(obj.model) && color
        .equals(obj.color) && licenseNumber.equals(obj.licenseNumber)
        && year == obj.year;
  }

  public String toString()
  {
    return "Make: " + make + "\nModel: " + model + "\nColor: " + color
        + "\nLicense number: " + licenseNumber + "\nYear: " + year;
  }

}
