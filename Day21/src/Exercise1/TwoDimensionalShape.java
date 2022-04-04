package Exercise1;

public abstract class TwoDimensionalShape
{
  private double x;
  private double y;

  public TwoDimensionalShape(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public abstract double getArea();

  public boolean equals(Object obj) {
    if(!(obj instanceof TwoDimensionalShape)) {
      return false;
    }
    TwoDimensionalShape other = (TwoDimensionalShape) obj;
    return x == other.x && y == other.y;
  }

  public String toString() {
    return "x: " + x +
        "\ny: " + y;
  }

}
