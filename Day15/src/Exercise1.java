public class Exercise1
{
  public static void main(String[] args)
  {
    int size = 10;
    int[] numbers = new int[size];

    for (int i = 0; i <= size-1; i++) {
      numbers[i] = i;
    }

    for (int i = 0; i <= size-1; i++) {
      numbers[i] = numbers[i]*2;
    }

    for (int i = 0; i <= size-1; i++) {
      System.out.println(numbers[i]);;
    }


  }
}
