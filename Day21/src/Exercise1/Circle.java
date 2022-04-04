package Exercise1;

public class Circle extends TwoDimensionalShape
{
  private double radius;
  public Circle(double x, double y, double radius) {
    super(x, y);
    this.radius = radius;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Circle)) {
      return false;
    }
    Circle other = (Circle) obj;
    return super.equals(other) && radius == other.radius;
  }

  public String toString() {
    return super.toString() +
        "\nRadius: " +
        "\nArea: " + getArea();
  }
}
