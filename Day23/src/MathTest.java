import java.util.Scanner;

public class MathTest
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x: ");
    int x = sc.nextInt();

    System.out.println("Enter y: ");
    int y = sc.nextInt();

    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));

    try {
      System.out.println("x / y = " + (x / y));
    }
    catch (java.lang.ArithmeticException e) {
      e.printStackTrace();
    }

    System.out.println("x * y = " + (x * y));
  }



}
