package ExamExample1;

public class Date
{
  private int day;
  private int month;
  private int year;

  public Date() {
  }

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public void set(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public Date copy() {
    Date newDate = new Date();
    return newDate;
  }

  public boolean equals(Object obj) {
    if(!(obj instanceof Date)) {
      return false;
    }
    Date other = (Date)obj;
    return day == other.day && month == other.month && year == other.year;
  }

  public String toString() {
    return day + "/" + month + "/" + year;
  }




}
