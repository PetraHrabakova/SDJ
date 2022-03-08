import java.util.Scanner;

public class Age
{
  public static void main(String[] args)
  {
    int age;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your age: ");
    age = sc.nextInt();

    if (age < 0) {
      System.out.println("Error in the age value.");
    }
    else if ((age >= 0) && (age <= 12)) {
      System.out.println("Child.");
    }
    else if ((age >= 13) && (age <= 19)) {
      System.out.println("Teenager.");
    }
    else if ((age >= 20) && (age <= 65)) {
      System.out.println("Teenager.");
    }
    else if (age > 65) {
    System.out.println("Senior citizen.");
  }

  }
}
