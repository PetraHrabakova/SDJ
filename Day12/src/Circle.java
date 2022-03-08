public class Circle
{
  private double radius;

  public Circle() {
    radius = 0;
  }

  public Circle(double radius) {
    this.radius = radius;
  }


  private double getArea() {
    return Math.PI * radius * radius;
  }

  private double getRadius() {
    return radius;
  }

  public String toString() {
    return "Radius: " + radius +
        "\nCircle area: " + getArea();
  }

  public boolean equals(Circle obj) {
    return radius == obj.radius && getArea() == obj.getArea();
  }

  public boolean greaterThan(Circle obj) {
    return getArea() < obj.getArea();
  }
}
