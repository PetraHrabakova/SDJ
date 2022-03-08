import java.util.Scanner;
import java.util.Random;

public class GuessRandom
{
  public static void main(String[] args)
  {
    int numberUser;
    int numberComp;
    Scanner sc = new Scanner(System.in);
    Random rn = new Random();

    numberComp = rn.nextInt(10)+1;

    System.out.println("Type your guess (integer between 1 to 10): ");
    numberUser = sc.nextInt();

    if (numberComp == numberUser) {
      System.out.println("Your answer is correct.");
    }
    else {
      System.out.println("Oops, not the right number. " + numberComp + " is correct.");
    }

  }
}
