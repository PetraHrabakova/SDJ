public class Workbench5
{
  public static void main(String[] args)
  {
    double c = 0;
    double i;
    double j;
    for (i = 1, j = 30; i <= 30; i++, j--) {
      double a = i/j;
      System.out.println(a);
      c = c+a;
    }
    System.out.println(c);
  }
}

