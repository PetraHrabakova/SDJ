import java.util.Scanner;

public class TestScoresDemo
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter score 1: ");
    double score1 = sc.nextDouble();
    System.out.println("Enter score 2:");
    double score2 = sc.nextDouble();
    System.out.println("Enter score 3: ");
    double score3 = sc.nextDouble();


    TestScores score = new TestScores(score1, score2, score3);

    System.out.println("Average score is: " + score.average());



  }
}
