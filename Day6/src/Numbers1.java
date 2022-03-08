import java.util.Scanner;

public class Numbers1
{
  public static void main(String[] args)
  {
    int number1;
    int number2;

    Scanner sc = new Scanner(System.in);

    System.out.println("Number 1: ");
    number1 = sc.nextInt();
    System.out.println("Number 2: ");
    number2 = sc.nextInt();

    if (number1 < number2) {
      System.out.println(number1);
    }
    else if (number2 < number1) {
      System.out.println(number2);
    }





  }
}
