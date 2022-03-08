import java.util.Random;
import java.util.Scanner;

public class Exercise6
{
  public static void main(String[] args)
  {
    int numberUser;
    int numberComp;
    Scanner sc = new Scanner(System.in);
    Random rn = new Random();
    int count = 0;

    do {
      numberComp = rn.nextInt(1000) + 1;

      System.out.println("Type your guess (integer between 1 to 1000): ");
      numberUser = sc.nextInt();
      if (numberComp > numberUser)
      {
        System.out.println("Oops, your answer was too low.");
        count++;
      }
      else
      {
        System.out.println("Oops, your answer was too high.");
        count++;
      }
    }
    while (numberComp != numberUser);
    System.out.println("Woohoo, you got it right, here is "
        + "the number of your attempts: " + count);

  }
}


