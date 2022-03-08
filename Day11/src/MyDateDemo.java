import java.time.LocalDate;

public class MyDateDemo
{
  public static void main(String[] args)
  {
    LocalDate currentDate = LocalDate.now();
    int currentDay = currentDate.getDayOfMonth();
    int currentMonth = currentDate.getMonthValue();
    int currentYear = currentDate.getYear();

    MyDate date1 = new MyDate(currentDay, currentMonth, currentYear);
    MyDate date2 = new MyDate(29,6,1998);
    MyDate date3 = new MyDate(28, 6, 1998);

    date3.nextDays(100);

    System.out.println(date2.isBefore(date3));
    System.out.println(date3);

  }



}
