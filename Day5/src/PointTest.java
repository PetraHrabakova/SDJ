public class PointTest
{
  public static void main(String[] args)
  {
    Point point1 = new Point(10, 12);
    Point point2 = new Point(1, 3);

    point1.moveTo(10, 12);
    System.out.println(point1);
    point1.move(1, 2);
    System.out.println(point1);


    double dist = Math.sqrt((Math.pow(point2.getX()-point1.getX(),2))+Math.pow(point2.getY()-point1.getY(),2));
    System.out.println("Distance: " + dist);
  }





}
