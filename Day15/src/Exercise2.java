public class Exercise2
{
  public static void main(String[] args)
  {
    int[] sourceArray = {1, 2, 3, 4, 5};
    int size = sourceArray.length;
    int[] destinationArray = new int[size];

    for (int i = 0; i <= size-1; i++) {
      destinationArray[i] = sourceArray[i];
    }

    for (int i = 0; i <= size-1; i++) {
      System.out.println(destinationArray[i]);
    }




  }
}
