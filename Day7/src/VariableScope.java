import java.sql.SQLOutput;
import java.util.Scanner;

public class VariableScope
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your first name: ");
    String firstName;
    firstName = sc.nextLine();

    System.out.println("Enter your last name: ");
    String lastName;
    lastName = sc.nextLine();

    System.out.println("Hello " + firstName + " " + lastName);
  }
}
