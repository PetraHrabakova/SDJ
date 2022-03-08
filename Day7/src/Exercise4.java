import java.util.Scanner;

public class Exercise4
{
  public static void main(String[] args)
  {
    String username;
    String password;
    String confPassword;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter username: ");
    username = sc.nextLine();
    System.out.println("Enter password: ");
    password = sc.nextLine();
    System.out.println("Enter password: ");
    confPassword = sc.nextLine();

    System.out.println("Username: " + username);
    if (password.equals(confPassword)) {
      System.out.println("Passwords are identical.");
    }
    else {
      System.out.println("Passwords are not identical.");
    }


  }
}
