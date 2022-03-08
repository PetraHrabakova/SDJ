public class MyDate
{
  int day;
  int month;
  int year;

  public MyDate(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }


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

  public String toString() {
    return day + "/" + month + "/" + year;
  }

  public boolean isLeapYear()
  {
    if (year % 100 == 0)
    {
      if (year % 400 == 0)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    else if (year % 4 == 0) {
      return true;
    }
    else {
      return false;
    }
  }


}
