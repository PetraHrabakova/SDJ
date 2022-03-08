public class MyDate
{
  int day;
  int month;
  int year;

  public void setDay(int d) {
    day = d;
  }

  public void setMonth(int m) {
    month = m;
  }

  public void setYear(int y) {
    year = y;
  }

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  public String displayDate() {
    return day + "/" + month + "/" + year;
  }
}
