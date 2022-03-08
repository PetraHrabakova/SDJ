public class Exercise302
{
  public static void main(String[] args)
  {
    double a = 2;
    double b;
    double c = 0;
    double piResult = 0;
    int count = 0;

    do
    {
      for (int i = 1; i <= (10 - 1); i++)
      {
        if (i % 2 == 0)
        {
          b = 1 / (a * i + 1);
          count++;
        }
        else
        {
          b = (-1) / (a * i + 1);
          count++;
        }
        c += b;
        piResult = 4 * (1 + c);
      }
    }
    while (String.valueOf(piResult).length() != 6);
    System.out.println("Pi = " + piResult);
    System.out.println("Count = " + count);

  }
}



