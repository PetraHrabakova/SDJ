public class GarageDemo
{
  public static void main(String[] args)
  {
    Car car1 = new Car("Tesla", "3", "red", 2022);
    Car car2 = new Car("Tesla", "3", "red", 2022);
    Garage garage1 = new Garage();
    Garage garage2 = new Garage();

    System.out.println(garage1.equals(garage2));
    System.out.println(garage1);
    System.out.println(garage2);
    garage1.park(car1, 1);
    garage2.park(car2, 2);
    System.out.println(garage1.equals(garage2));
    System.out.println(garage1);
    System.out.println(garage2);


  }
}
