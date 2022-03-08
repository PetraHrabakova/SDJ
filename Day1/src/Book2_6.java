import java.util.Scanner;

public class Book2_6
{
  public static void main(String[] args)
  {
    // Get input from user
    Scanner sc = new Scanner(System.in);  // Create new scanner object
    System.out.print("Enter number here (choose number"
        + "between 0 and 1000): ");
    int value = sc.nextInt();   // 675

    int x = value % 10;         // 675 % 10 = 5 - first digit
    int y = value / 10;         // 675 / 10 = 67
    int z = y % 10;             // 67 % 10 = 7 - second digit
    int a = y / 10;             // 67 / 10 = 6 - third digit
    int result = x + z + a;     // sum of them

    System.out.println("The sum of integers is: " + result);


  }


}
