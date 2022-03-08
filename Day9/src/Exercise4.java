public class Exercise4
{
  public static void main(String[] args)
  {
    int n = 20;
    int a = 0;
    int b = 1;

    for (int i = 0; i < 20; i++) {
      System.out.println("Fibonacci(" + i + ") = " + b);
      b = a+b;
      a = b-a;

//      int c = a + b;
//      a = b;
//      b = c;
    }
  }
}
