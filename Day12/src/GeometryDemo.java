import java.sql.SQLOutput;
import java.util.Scanner;

public class GeometryDemo
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Geometry Calculator");
    System.out.println("1. Calculate the Area of a Circle");
    System.out.println("2. Calculate the Area of a Rectangle");
    System.out.println("3. Calculate the Area of a Triangle");
    System.out.println("4. Quit");
    System.out.println();
    System.out.println("Enter your choice (1-4): ");
    int number = sc.nextInt();

    if (number >= 1 && number <= 4)
    {
      switch (number)
      {
        case 1 -> {
          System.out.println("Enter your radius: ");
          double radius = sc.nextDouble();
          if (radius < 0) {
            System.out.println("Yo, don't insert negative numbers.");
            break;
          }
          Geometry circle = new Geometry();
          System.out.println(circle.area(radius));
        }
        case 2 -> {
          System.out.println("Enter side A: ");
          float sideA = sc.nextFloat();
          System.out.println("Enter side B: ");
          float sideB = sc.nextFloat();
          if (sideA < 0 || sideB < 0) {
            System.out.println("Yo, don't insert negative numbers.");
            break;
          }
          Geometry rectangle = new Geometry();
          System.out.println(rectangle.area(sideA, sideB));
        }
        case 3 -> {
          System.out.println("Enter triangle base: ");
          double base = sc.nextDouble();
          System.out.println("Enter triangle height: ");
          double height = sc.nextDouble();
          if (base < 0 || height < 0) {
            System.out.println("Yo, don't insert negative numbers.");
            break;
          }
          Geometry triangle = new Geometry();
          System.out.println(triangle.area(base, height));
        }
        case 4 -> System.out.println("Okie, bye.");
        default -> System.out.println("You entered a wrong number.");
      }
    }
    else {
        System.out.println("You entered a wrong number.");
      }
  }
}
