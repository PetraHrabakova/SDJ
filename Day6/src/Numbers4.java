import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Numbers4
{
  public static void main(String[] args)
  {
    Integer [] numbers = new Integer[4];

    Scanner sc = new Scanner(System.in);

    System.out.println("Number 1: ");
    numbers[0] = sc.nextInt();
    System.out.println("Number 2: ");
    numbers[1] = sc.nextInt();
    System.out.println("Number 3: ");
    numbers[2] = sc.nextInt();
    System.out.println("Number 4: ");
    numbers[3] = sc.nextInt();


    Arrays.sort(numbers, Collections.reverseOrder());
    System.out.println("Sorted numbers: " + numbers[0] + ", " + numbers[1]
    + ", " + numbers[2] + ", " + numbers[3]);

  }
}
