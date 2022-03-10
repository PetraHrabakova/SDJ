public class Car
{
  String make;
  String model;
  String color;
  String licenseNumber;
  int year;

  public Car(String make, String model, String color, String licenseNumber, int year) {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = licenseNumber;
    this.year = year;
  }

  public Car(String make, String model, String color, int year) {
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

  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  public Car copy() {
    Car obj = new Car(make, model, color, licenseNumber, year);
    return obj;
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Car)) {
      return false;
    }
    Car other = (Car) obj;

    return make.equals(other.make) && model.equals(other.model) && color
        .equals(other.color) && licenseNumber.equals(other.licenseNumber)
        && year == other.year;
  }

  public String toString() {
    return "Make: " + make + "\nModel: " + model + "\nColor: " + color
        + "\nLicense number: " + licenseNumber + "\nYear: " + year;
  }

}
