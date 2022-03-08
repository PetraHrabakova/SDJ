public class MyDateDemo3
{
  public static void main(String[] args)
  {
    MyDate myBirthday = new MyDate(18, 2, 2022);
    int count = 0;

    do {
      count++;
      myBirthday.nextDay();
    }
    while (!(myBirthday.getDay() == 28 && myBirthday.getMonth() == 2 && myBirthday.getYear() == 2022));
    System.out.println(count);
  }
}
