public class MyNumberDemo
{
  public static void main(String[] args)
  {
    MyNumber number1 = new MyNumber(28);
    MyNumber number2 = new MyNumber(31);
    System.out.println(number1.plus(number2));
    System.out.println(number2.isPrime());
  }
}
