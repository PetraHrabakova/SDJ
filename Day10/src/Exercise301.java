import java.sql.SQLOutput;
import java.util.Scanner;


public class Exercise301
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of iterations: ");
    int userInput = sc.nextInt();
    double a = 2;
    double b;
    double c = 0;
    double piResult = 0;

    for (int i = 1; i <= (userInput-1); i++) {
      if (i%2 == 0) {
        b = 1/(a*i+1);
      }
      else {
        b = (-1)/(a*i+1);
      }
      c+=b;
      piResult = 4*(1+c);
    }
    System.out.println(piResult);

  }
}
