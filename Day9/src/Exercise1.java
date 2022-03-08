import java.util.Scanner;

public class Exercise1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n;

    System.out.println("Enter your number: ");
    n = sc.nextInt();

    // Prints out n
    for (int i = 1; i <= n; i++) {
      System.out.println(i);

    }

    // Prints out 2*n
    for (int i = 1; i <= n; i++) {
      System.out.println(2*i);
    }

    // Prints out n^2
    for (int i = 1; i <= n; i++) {
      System.out.println((int)Math.pow(i, 2));
    }




  }
}
