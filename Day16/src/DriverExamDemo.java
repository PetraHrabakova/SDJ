import java.util.Scanner;

public class DriverExamDemo
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String[] userAnswers = new String[20];
    String answer = "";

    for (int i = 0; i < userAnswers.length; i++) {
      System.out.println("Question " + (i+1) + ": ");
      answer = sc.nextLine();
      userAnswers[i] = answer;
    }

    DriverExam studentExam = new DriverExam(userAnswers);

    System.out.println(studentExam.totalCorrect());
    System.out.println(studentExam.totalIncorrect());
    studentExam.questionsMissed();
    System.out.println(studentExam);
  }
}
