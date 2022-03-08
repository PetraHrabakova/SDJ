public class Rectangle
{
  private double length;
  private double width;

  // The setLength method accepts an argument that
  // is stored in the length field
  public void setLength(double len) {
    length = len;
  }

  // The setWidth method accepts an argument
  // that is stored in the width field
  public void setWidth(double w) {
    width = w;
  }

  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

  public double getArea() {
    return length * width;
  }


}
