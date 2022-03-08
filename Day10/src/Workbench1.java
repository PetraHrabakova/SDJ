import java.util.Scanner;

public class Workbench1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int number;
    System.out.println("Enter number:");
    number = sc.nextInt();
    int product = number;

    while (product < 100) {
      product = product*10;
      System.out.println(product);
    }
  }
}
