public class Area
{
  public static double area(double radius) {
    return Math.PI * Math.pow(radius, 2);
  }

  public static double area(int width, int length) {
    return (double)(width*length);
  }

  public static double area(double radius, double height) {
    return Math.PI * Math.pow(radius, 2) * height;
  }

}
