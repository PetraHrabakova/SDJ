package Exercise3;

import java.util.Scanner;

public class Exercise3a
{
  public static void main(String[] args)
  {
    int sum = 0;
    int count = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your value: ");
    int value = sc.nextInt();
    do
    {
      sum += value;
      count += 1;
      System.out.println("Enter your value: ");
      value = sc.nextInt();
    }
    while (sum < 20 && count < 10);
    if (sum < 20)
    {
      System.out.println(count);
    }
    else
    {
      System.out.println(sum);
    }
  }


}
