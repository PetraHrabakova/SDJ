import java.util.Scanner;

public class Exercise6
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = 4;
    int[] array1 = new int[size];
    int[] array2 = new int[size];
    int[] sumArray = new int[size];



    for (int i = 0; i <= size-1; i++) {
      System.out.println("Enter number: ");
      int n = sc.nextInt();
      array1[i] = n;
    }

    for (int i = 0; i <= size-1; i++) {
      System.out.println("Enter number: ");
      int n = sc.nextInt();
      array2[i] = n;
    }

    for (int i = 0; i <= size-1; i++) {
      sumArray[i] = array1[i] + array2[i];
      System.out.println(sumArray[i]);
    }

  }
}
