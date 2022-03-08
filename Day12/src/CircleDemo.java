public class CircleDemo
{
  public static void main(String[] args)
  {
    Circle circle1 = new Circle();
    Circle circle2 = new Circle(2);

    System.out.println(circle1.equals(circle2));
    System.out.println(circle1.greaterThan(circle2));
  }
}
