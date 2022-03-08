public class LengthWidthDemo
{
  public static void main(String[] args)
  {
    Rectangle box = new Rectangle();

    box.setLength(10.0);
    box.setWidth(20.0);
    double area = box.getArea();

    System.out.println("The box's length is " + box.getLength());
    System.out.println("The box's width is " + box.getWidth());
    System.out.println("The box's area is " + area);

  }
}
