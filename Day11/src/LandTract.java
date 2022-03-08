public class LandTract
{
  double length;
  double width;

  public LandTract(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double area() {
    return length * width;
  }

  public boolean equals(LandTract obj) {
    if (area() == obj.area()) {
      return true;
    }
    else {
      return false;
    }
  }

  public String toString() {
    return "The area is: " + area();
  }


}
