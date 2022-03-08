import java.util.Scanner;

public class Question1
{
  public static void main(String[] args)
  {
    int value1;
    int value2;
    int value3;
    Scanner sc = new Scanner(System.in);

    System.out.println("Type an integer: ");
    value1 = sc.nextInt();
    System.out.println("Type a second integer: ");
    value2 = sc.nextInt();
    System.out.println("Type a third integer: ");
    value3 = sc.nextInt();

    int product = value1 * value2;
    int sum = value1 + value2;
    double quotient = (double)value2/(double)value3;
    int difference = value2-value3;

    System.out.println("The product of (" + value1 + " * " + value2 + ")"+ " is " + product);
    System.out.println("The sum of (" + value1 + " + " + value2 + ")" + " is " + sum);
    System.out.println("The quotient of (" + value2 + " * " + value3 + ")"+ " is " + quotient);
    System.out.println("The difference of (" + value2 + " * " + value3 + ")"+ " is " + difference);

  }
}
