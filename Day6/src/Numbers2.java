import java.util.Scanner;
import java.util.Arrays;

public class Numbers2
{
  public static void main(String[] args)
  {
    int [] numbers = new int[2];

    Scanner sc = new Scanner(System.in);

    System.out.println("Number 1: ");
    numbers[0] = sc.nextInt();
    System.out.println("Number 2: ");
    numbers[1] = sc.nextInt();

    Arrays.sort(numbers);
    System.out.println("Sorted numbers: " + numbers[0] + ", " + numbers[1]);



  }
}
