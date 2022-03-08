import java.util.Scanner;

public class Grade
{
  public static void main(String[] args)
  {
    int grade;
    Scanner sc = new Scanner(System.in);
    int danishScale[] = {12, 10, 7, 4, 2, 0, -3};
    String internationalScale[] = {"A", "B", "C", "D", "E", "Fx", "F"};

    System.out.println("Enter your Danish grade: ");
    grade = sc.nextInt();

    if (grade == danishScale[0]) {
      System.out.println("International grade: " + internationalScale[0]);
    }
    else if (grade == danishScale[1]) {
      System.out.println("International grade: " + internationalScale[1]);
    }
    else if (grade == danishScale[2]) {
      System.out.println("International grade: " + internationalScale[2]);
    }
    else if (grade == danishScale[3]) {
      System.out.println("International grade: " + internationalScale[3]);
    }
    else if (grade == danishScale[4]) {
      System.out.println("International grade: " + internationalScale[4]);
    }
    else if (grade == danishScale[5]) {
      System.out.println("International grade: " + internationalScale[5]);
    }
    else if (grade == danishScale[6]) {
      System.out.println("International grade: " + internationalScale[6]);
    }


  }
}
