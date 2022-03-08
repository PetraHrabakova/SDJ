public class Workbench8
{
  public static void main(String[] args)
  {
    String ch = "#";
    String space = " ";
    for (int i = 0; i <= 5; i++)
    {
      System.out.print(ch);
      for (int j = 0; j <= i; j++)
      {
        System.out.print(space);
      }
      System.out.println(ch);
    }
  }
}
