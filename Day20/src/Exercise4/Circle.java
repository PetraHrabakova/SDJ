package Exercise4;

public class Circle
{
  private double radius;
  Point center;

  public Circle(double x, double y, double radius) {
    this.radius = radius;
    center = new Point(x, y);
  }

  public Point getCenter()
  {
    return center;
  }

  public double getRadius()
  {
    return radius;
  }

  public void moveCircle(double dx, double dy) {
    center = new Point(center.getX() + dx, center.getY() + dy);
  }

  public double getArea() {
    return Math.pow(2, radius) * Math.PI;
  }

  public String toString() {
    return center + "\nRadius: " + radius;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Circle)) {
      return false;
    }
    Circle other = (Circle) obj;
    return other.equals(center);
  }

}
