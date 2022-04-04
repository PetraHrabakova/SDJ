package Exercise1;

import org.w3c.dom.css.Rect;

public class Rectangle extends TwoDimensionalShape
{
  private double width;
  private double length;

  public Rectangle(double x, double y, double width, double length) {
    super(x, y);
    this.width = width;
    this. length = length;
  }

  public double getArea() {
    return width * length;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Rectangle)) {
      return false;
    }
    Rectangle other = (Rectangle) obj;
    return super.equals(other) && width == other.width && length == other.length;
  }

  public String toString() {
    return super.toString() +
        "\nWidth: " + width +
        "\nLength: " + length +
        "\nArea: " + getArea();
  }

}
