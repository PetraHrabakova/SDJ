import java.util.Scanner;

public class MyDateDemo2
{
  public static void main(String[] args)
  {
    MyDate date1 = new MyDate(25, 11, 0);
    int count = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("This program allows you to calculate "
        + "the number of leap years between the years you insert.");
    System.out.println("Start year: ");
    int i = sc.nextInt();
    System.out.println("End year: ");
    int j = sc.nextInt();


    for (int k = i; k <= j; k++)
    {
      date1.setYear(k);

      // If it is a leap year, do count++
      if (date1.isLeapYear())
      {
        count++;
      }
    }
    System.out.println(count);
  }
}

