public class Car
{
  int yearModel;
  String make;
  int speed;

  public Car(int yearModel, String make) {
    this.yearModel = yearModel;
    this.make = make;
    speed = 0;
  }
  public int getYearModel() {
    return yearModel;
  }

  public String getMake() {
    return make;
  }

  public int getSpeed() {
    return speed;
  }

  public String accelerate() {
    speed+=5;
    return "New speed: " + speed;
  }

  public String brake() {
    speed-=5;
    return "New speed: " + speed;
  }


}
