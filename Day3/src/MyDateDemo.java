public class MyDateDemo
{
  public static void main(String[] args)
  {
    MyDate date1 = new MyDate();
    MyDate date2 = new MyDate();

    // Create Date1
    date1.setDay(29);
    date1.setMonth(6);
    date1.setYear(1998);

    // Create Date 2
    date2.setDay(29);
    date2.setMonth(7);
    date2.setYear(2000);

    // Print Date 1
    System.out.println("Date 1: " + date1.displayDate());

    // Print Date 2
    System.out.println("Date 2: " + date2.displayDate());

  }
}


