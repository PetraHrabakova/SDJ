import java.util.Scanner;

public class Exercise6
{
  public static void main(String[] args)
  {
    int a;
    int b;
    int c;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter values for the quadratic equation.");
    System.out.println("a =");
    a = sc.nextInt();
    System.out.println("b = ");
    b = sc.nextInt();
    System.out.println("c = ");
    c = sc.nextInt();

    double d = Math.pow(b,2) - 4*a*c;
    System.out.println(d);

    if (d < 0) {
      System.out.println("There is no solution");
    }
    else if (d == 0) {
      System.out.println("There is 1 solution.");
      int x = -b / 2*a;
      System.out.println(x);
    }
    else if (d > 0) {
      System.out.println("There are 2 solutions.");
      double x1 = (-b+Math.sqrt(d))/(2*a);
      System.out.println("x1 = " + x1);
      double x2 = (-b-Math.sqrt(d))/(2*a);
      System.out.println("x2 = " + x2);
    }

  }
}
