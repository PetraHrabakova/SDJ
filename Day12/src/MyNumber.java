public class MyNumber
{
  private int number;

  public MyNumber(int number) {
    this.number = number;
  }

  public int getNumber()
  {
    return number;
  }

  public int getLastDigit() {
    if (number < 0) {
      number*=-1;
      return number % 10;
    }
    else {
      return number % 10;
    }
  }

  public int getFirstDigit() {
    String len = String.valueOf(number);
    int n = len.length();
    for (int i = 0; i < (n-1); i++) {
      int a = number;
      a/=10;
      number = a;
      if (number < 10) {
        return number;
      }
    }
    return number;
  }

  public boolean isDivisibleBy(MyNumber obj) {
    return number % obj.number == 0;
  }





}

