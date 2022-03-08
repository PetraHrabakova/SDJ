public class Clock
{
  private int hour;
  private int minute;
  private int second;
  boolean timeFormat24;

  public Clock(int h, int m, int s) {
    hour = h;
    minute = m;
    second = s;
  }

  public Clock(int totalTimeInSeconds) {
    minute = totalTimeInSeconds/60;
    second = totalTimeInSeconds%60;


    if (minute > 60) {
      hour = minute/60;
    }
  }

  public void set(int h, int m, int s) {
    hour = h;
    minute = m;
    second = s;
  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  public void tic() {
    second += 1;
    if (second > 59) {
      second = 0;
      minute += 1;
      if (minute > 59) {
        minute = 0;
        hour +=1;
        if (hour > 23) {
          hour = 0;
        }
      }
    }
  }

  public int convertToSeconds() {
    int seconds;
    seconds = (hour*60*60)+(minute*60)+second;
    return seconds;
  }

  //
  public boolean isBefore(Clock time) {
    if (hour <= time.hour) {
      if (minute <= time.minute) {
        if (second < time.second) {
          return true;
        }
        else {
          return false;
        }
      }
      else {
        return false;
      }
    }
    else {
      return false;
    }
  }

  // Return the difference between two times
  public int timeInSecondsTo(Clock time) {
    int timeNow;

    // Convert actual time to seconds
    timeNow = (hour*60*60) + (minute*60) + second;

    // Convert time in argument to seconds
    int timeArgument = time.convertToSeconds();

    // Get the difference of those times in seconds
    int difference = timeNow - timeArgument;

    // If resulting seconds are negative, multiply by -1
    if (difference < 0) {
      return difference*(-1);
    }
    else {
      return difference;
    }
  }

  public Clock timeTo(Clock time) {
    Clock clock = new Clock(timeInSecondsTo(time));
    return clock;
  }

  public String toString() {
    if (timeFormat24) {
      return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    else {
      if (hour < 12) {
        return String.format("%02d:%02d:%02d", hour, minute, second) + " AM";
      }
      else {
        hour -= 12;
        return String.format("%02d:%02d:%02d", hour, minute, second) + " PM";
      }
    }
  }

  public boolean isTimeFormat24() {
    return timeFormat24;
  }

  public void setTimeFormat(int hourFormat) {
    if (hourFormat == 12) {
      timeFormat24 = false;
    }
    else if (hourFormat == 24) {
      timeFormat24 = true;
    }
  }

}
