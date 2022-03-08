import java.util.Scanner;

public class Challenge1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int number = 0;
    System.out.println("Enter a positive nonzero integer: ");
    int userInput = sc.nextInt();

    for (int i = 1; i <= userInput; i++) {
      number+=i;
    }

    System.out.println("Sum of all integers: " + number);





  }



}
