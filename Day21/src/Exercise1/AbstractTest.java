package Exercise1;

public class AbstractTest
{
  public static void main(String[] args)
  {
    Circle c1 = new Circle(7.0, 7.0, 3.0);
    Rectangle r1 = new Rectangle(3.0, 2.0, 7.0, 3.0);

    System.out.println(c1.getArea());
    System.out.println(r1.getArea());

    TwoDimensionalShape tds1 = new Circle(6.0, 6.0, 5.0);
    TwoDimensionalShape tds2 = new Rectangle(5.0, 3.0, 1.0, 7.0);

    System.out.println(tds1);
    System.out.println(tds2);

  }



}
