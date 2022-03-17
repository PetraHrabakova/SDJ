import java.util.Scanner;

public class Exercise5
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = 4;
    int[] array1 = new int[size];
    int[] array2 = new int[size];
    boolean arrayEquals = true;



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

    if (array1.length != array2.length) {
      arrayEquals = false;
    }
    else {
      for (int i = 0; i <= size-1; i++) {
        if (array1[i] != array2[i]) {
          arrayEquals = false;
          // break; - do this or put else statement that sets arrayEquals to true
        }
        else
          arrayEquals =  true;
      }
    }

    if (arrayEquals) {
      System.out.println("The arrays are equal.");
    }
    else
      System.out.println("The arrays don't equal.");

  }
}
