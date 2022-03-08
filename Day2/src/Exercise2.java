import java.util.Scanner;

public class Exercise2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insert value 1: ");
    int value1 = sc.nextInt();
    System.out.println("Insert value 2: ");
    int value2 = sc.nextInt();
    System.out.println("Insert value 3: ");
    int value3 = sc.nextInt();

    int result = value1 + value2 + value3;
    System.out.println("The sum of your value is " + result);

  }
}
