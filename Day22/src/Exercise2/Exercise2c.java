package Exercise2;

import java.util.Scanner;

public class Exercise2c
{
  public static void main(String[] args)
  {
    int positiveSum = 0;
    System.out.println("Enter an integer: ");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    do {
      if (x > 0) {
        positiveSum += x;
      }
      System.out.println("Enter an integer: ");
      x = sc.nextInt();

    } while (x != 0);
    System.out.println(positiveSum);
  }
}
