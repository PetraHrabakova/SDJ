public class ClockTest
{
  public static void main(String[] args)
  {
    Clock clockNow = new Clock(14, 20, 41);
  //  Clock clockBefore = new Clock(14, 20, 20);

  //  clockNow.set(14, 26, 40);
  //  System.out.println(clockNow.getHour());
  //  System.out.println(clockNow.getMinute());
  //  System.out.println(clockNow.getSecond());
  //  System.out.println(clockNow);
  //  clockNow.tic();
  //  System.out.println(clockNow);
  //  System.out.println(clockNow.getSecond());
  //  System.out.println(clockNow.convertToSeconds());
  //  System.out.println(clockBefore.isBefore(clockNow));
  //  System.out.println(clockNow.timeInSecondsTo(clockBefore));
  //  System.out.println(clockNow.timeTo(clockBefore));

    clockNow.setTimeFormat(12);
    System.out.println(clockNow);

  }

}
