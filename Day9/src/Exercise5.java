import java.util.Scanner;

public class Exercise5
{
  public static void main(String[] args)
  {
    String input;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("Type your string: ");
      input = sc.nextLine();

      for (int i = input.length()-1; i >= 0; i--) {
        System.out.print(input.charAt(i));
      }
      System.out.println();
    }
    while (!input.equals("quit"));
  }
}
