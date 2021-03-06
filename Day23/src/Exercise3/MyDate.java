package Exercise3;

import Exercise2.IllegalGradeException;

import java.time.LocalDate;

public class MyDate
{
  int day;
  int month;
  int year;

  LocalDate currentDate = LocalDate.now();
  int currentDay = currentDate.getDayOfMonth();
  int currentMonth = currentDate.getMonthValue();
  int currentYear = currentDate.getYear();


  public MyDate(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public MyDate() {
    day = currentDay;
    month = currentMonth;
    year = currentYear;
  }

  public void setDay(int d) {
    if (d <= 0 || d > 31) {
      throw new IllegalDateException();
    }
    day = d;
  }

  public void setMonth(int m) {
    if (m > 12 || m <= 0) {
      throw new IllegalDateException();
    }
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

  public boolean isLeapYear() {
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

  public int daysInMonth() {
    if (month == 1 || month == 3 || month == 5 ||month == 7 || month == 8 || month == 10 || month == 12) {
      return 31;
    }
    else if (month == 2)
    {
      if (isLeapYear())
      {
        return 29;
      }
      else
      {
        return 28;
      }
    }
    else if (month == 4 || month == 6 || month == 9 || month == 11)
    {
      return 30;
    }
    else {
      return -1;
    }
  }

  public String getAstroSign() {
    if ((month == 3 && day >= 21 && day <= 31) || (month == 4 && day >= 1 && day <= 19)) {
      return "Aries";
    }
    else if ((month == 4 && day >= 20 && day <= 30) || (month == 5 && day >= 1 && day <= 20)) {
      return "Taurus";
    }
    else if ((month == 5 && day >= 21 && day <= 31) || (month == 6 && day >= 1 && day <= 20)) {
      return "Gemini";
    }
    else if ((month == 6 && day >= 21 && day <= 30) || (month == 7 && day >= 1 && day <= 22)) {
      return "Cancer";
    }
    else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22)) {
      return "Leo";
    }
    else if ((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22)) {
      return "Virgo";
    }
    else if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22)) {
      return "Libra";
    }
    else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21)) {
      return "Scorpio";
    }
    else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21)) {
      return "Sagittarius";
    }
    else if ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 19)) {
      return "Capricorn";
    }
    else if ((month == 1 && day >= 20 && day <= 31) || (month == 2 && day >= 1 && day <= 18)) {
      return "Aquarius";
    }
    else if ((month == 2 && day >= 19 && day <= 29) || (month == 3 && day >= 1 && day <= 20)) {
      return "Pisces";
    }
    else {
      return "You entered the wrong date.";
    }
  }

  public String dayOfWeek() {
    int weekDay;
    int yearNew;

    if (month == 1 || month == 2)
    {
      yearNew = year - 1;
    }
    else {
      yearNew = year;
    }

    int k = yearNew%100;
    int j = yearNew/100;

    weekDay = (day + (((13*(month+1))/5)) + k + (k/4) + (j/4) + (5*j))%7;

    if (weekDay == 0) {
      return "Monday";
    }
    else if (weekDay == 1) {
      return "Tuesday";
    }
    else if (weekDay == 2) {
      return "Wednesday";
    }
    else if (weekDay == 3) {
      return "Thursday";
    }
    else if (weekDay == 4) {
      return "Friday";
    }
    else if (weekDay == 5) {
      return "Saturday";
    }
    else if (weekDay == 6) {
      return "Sunday";
    }
    else {
      return "The date you entered is wrong.";
    }
  }

  public String getMonthName() {
    switch (month)
    {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "Wrong month entered.";
    }
  }

  public void nextDay() {
    day += 1;
    if (day > daysInMonth()) {
      day = 1;
      month += 1;
      if (month > 12) {
        month = 1;
        year += 1;
      }
    }
  }

  // Compare dates
  public boolean equals(MyDate obj) {
    if (day == obj.day || month == obj.month || year == this.year)
    {
      return true;
    }
    else
      return false;
  }

  // Copy method
  public MyDate copy() {
    MyDate newDate = new MyDate(this.day, this.month, this.year);
    return newDate;
  }

  // Method that creates a new object with the same values as object1
  public MyDate(MyDate obj) {
    day = obj.day;
    month = obj.month;
    year = obj.year;
  }

  public void nextDays(int days) {
    for (int i = 0; i <= days; i++)
    {
      nextDay();
    }
  }

  public boolean isBefore(MyDate date2) {
    if (year < date2.year) {
      return true;
    }
    else if (year > date2.year) {
      return false;
    }
    else {
      if (month < date2.month) {
        return true;
      }
      else if (month > date2.month)
      {
        return false;
      }
      else
      {
        if (day < date2.day)
        {
          return true;
        }
        else
        {
          return false;
        }
      }
    }
  }


}





