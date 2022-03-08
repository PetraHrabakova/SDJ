public class CarDemo
{
  public static void main(String[] args)
  {
    Car car1 = new Car(2020,"Tesla");

    for(int i = 0; i < 6;i++) {
      System.out.println(car1.accelerate());
    }

    for(int k = 0; k < 6; k++) {
      System.out.println(car1.brake());
    }
  }
}
