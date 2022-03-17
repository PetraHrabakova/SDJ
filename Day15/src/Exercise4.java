import java.util.Scanner;

public class Exercise4
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = 5;
    int[] numbers = new int[size];
    double total = 0;
    double average = 0;

    for (int i = 0; i <= size-1; i++) {
      System.out.println("Number: ");
      int number = sc.nextInt();
      numbers[i] = number;
    }

    for (int i = 0; i <= size-1; i++) {
      total+=(double)numbers[i];
    }

    average = total/size;
    System.out.println(average);

  }

}
