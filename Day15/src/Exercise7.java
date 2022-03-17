public class Exercise7
{
  public static void main(String[] args)
  {
    int[] hits = {3, 5, 1, 3, 3, 2, 4, 2, 3};
    int sum = 0;
    int HoleinOne = 0;
    double average = 0;

    for (int i = 0; i <= hits.length-1; i++) {
      sum+= hits[i];
      if (hits[i] == 1) {
        HoleinOne+= 1;
      }
    }
    average = (double)sum/ hits.length;

    System.out.println("1. The total number of hits: " + sum);
    System.out.println("2. The average hits per hole: " + average);
    System.out.println("3. The number of Hole-in-Ones: " + HoleinOne);

  }
}

