public class CarDemo
{
  public static void main(String[] args)
  {
    Car car1 = new Car("3", "Tesla", "dark red", "GH123", 2020);
    Car car2 = new Car("3", "Tesla", "black", "GH123", 2021);

    System.out.println(car1.equals(car2));
    // System.out.println(car1);
    // System.out.println(car2);
  }
}
