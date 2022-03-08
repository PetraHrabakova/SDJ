import java.util.Scanner;

public class Exercise1
{
  public static void main(String[] args)
  {
    String username;
    String password;
    String confPassword;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("Username: ");
      username = sc.nextLine();
      System.out.println("Password: ");
      password = sc.nextLine();
      System.out.println("Confirm password: ");
      confPassword = sc.nextLine();
    }
    while (!(password.equals(confPassword)));

    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }
}
