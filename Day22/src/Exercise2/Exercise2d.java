package Exercise2;

import java.util.Scanner;

public class Exercise2d
{
  public static void main(String[] args)
  {
    int positiveSum = 0;
    int negativeSum = 0;
    System.out.println("Enter an integer: ");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    do {
      if (x > 0) {
        positiveSum += x;
      }
      else if (x < 0) {
        negativeSum += x;
      }
      System.out.println("Enter an integer: ");
      x = sc.nextInt();

    } while (x!= 0);
    System.out.println("Positive sum: " + positiveSum);
    System.out.println("Negative sum: " + negativeSum);
  }
}

