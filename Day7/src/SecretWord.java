import java.util.Scanner;

public class SecretWord
{
  public static void main(String[] args)
  {
    String input;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the secret word: ");
    input = sc.nextLine();

    if (input.equalsIgnoreCase("PROSPERO"))
    {
      System.out.println("Congratulations! You know the secret word.");
    }
    else
    {
      System.out.println("Sorry, that is NOT the secret word!");
    }
  }
}
