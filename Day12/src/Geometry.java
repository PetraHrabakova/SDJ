public class Geometry
{
  static double area(double radius) {
    return Math.PI * Math.pow(radius,2);
  }

  static float area(float length, float width) {
    return length*width;
  }

  static double area(double base, double height) {
    return base * height * 0.5;
  }
}
