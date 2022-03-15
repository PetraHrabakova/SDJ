package TicketSimulator;

public class ParkedCar
{
  String make;
  String model;
  String color;
  String licenseNumber;
  int minutesParked;

  public ParkedCar(String make, String model, String color, String licenseNumber, int minuteParked) {
    this.make = make;
    this.model = model;
    this. color = color;
    this.licenseNumber = licenseNumber;
    this.minutesParked = minutesParked;
  }

  public String getModel()
  {
    return model;
  }

  public String getMake()
  {
    return make;
  }

  public String getColor()
  {
    return color;
  }

  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  public void setMinuteParked(int minuteParked)
  {
    this.minutesParked = minuteParked;
  }

  public int getMinutesParked()
  {
    return minutesParked;
  }
}
