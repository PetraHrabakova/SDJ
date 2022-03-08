import java.util.Scanner;
import java.util.Random;

public class MathTutor
{
  public static void main(String[] args)
  {
    int number1;
    int number2;
    int sum;
    int userAnswer;

    Scanner sc = new Scanner(System.in);

    Random randomNumbers = new Random();

    number1 = randomNumbers.nextInt(100);
    number2 = randomNumbers.nextInt(100);

    System.out.println("What is the answer to the following problem?");
    System.out.println(number1 + " + " + number2 + " = ?");

    sum = number1 + number2;

    userAnswer = sc.nextInt();

    if (userAnswer == sum) {
      System.out.println("Correct!");
    }
    else {
      System.out.println("Sorry, wrong answer. The correct answer is " + sum + ".");
    }
  }
}
