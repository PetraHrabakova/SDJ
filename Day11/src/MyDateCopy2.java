public class MyDateCopy2
{
  public static void main(String[] args)
  {
    MyDate date1 = new MyDate(29, 6, 1998);
    MyDate date2;

    date2 = date1.copy();

    System.out.println(date1);
    System.out.println(date2);

  }
}
