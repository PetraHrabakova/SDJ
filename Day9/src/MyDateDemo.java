public class MyDateDemo
{
  public static void main(String[] args)
  {
    MyDate date1 = new MyDate(25, 11, 0);
    int count = 0;

    for (int i = 1582; i <= 2022; i++)
    {
      date1.setYear(i);

      // If it is a leap year, do count++
      if (date1.isLeapYear())
      {
        count++;
      }
    }
    System.out.println(count);
  }
}


