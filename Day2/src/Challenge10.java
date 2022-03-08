import java.util.Scanner;

public class Challenge10
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter score 1: ");
    int score1 = sc.nextInt();
    System.out.println("Enter score 2: ");
    int score2 = sc.nextInt();
    System.out.println("Enter score 3: ");
    int score3 = sc.nextInt();


    int average = (score1 + score2 + score3) / 3;
    System.out.println("Your score 1 is: " + score1);
    System.out.println("Your score 2 is: " + score2);
    System.out.println("Your score 3 is: " + score3);
    System.out.println("Your average score is: " + average);


  }
}
