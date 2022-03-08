import java.util.Locale;
import java.util.Scanner;

public class Gender
{
  public static void main(String[] args)
  {
    char gender;
    int age;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter gender: ");
    String gen = sc.nextLine();
    gender = gen.toUpperCase().charAt(0);
    System.out.println("Enter age: ");
    age = sc.nextInt();

    if (!((gender == 'M') || (gender == 'F')) || (age < 0)) {
      System.out.println("Error in typed values");
    }
    else if ((gender == 'M') && (age < 18)) {
      System.out.println("Boy.");
    }
    else if ((gender == 'M') && (age >= 18)) {
      System.out.println("Man.");
    }
    else if ((gender == 'F') && (age < 18)) {
      System.out.println("Girl.");
    }
    else if ((gender == 'F') && (age >= 18)) {
      System.out.println("Woman.");
    }

  }


}
