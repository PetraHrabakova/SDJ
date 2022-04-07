package Exercise3;

public class MyDateDemo
{
  public static void main(String[] args)
  {
    MyDate date1 = new MyDate(32,-2,1998);

    try {
      date1.getDay();
      date1.getMonth();
    }
    catch (IllegalDateException e) {
      System.out.println(e.getMessage());
  }


  }



}
