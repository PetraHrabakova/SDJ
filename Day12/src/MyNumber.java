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

  public int numberOfProperDivisors() {
    int count = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        count+=1;
      }
    }
    return count;
  }

  public boolean isPrime() {
    int count = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        count+=1;
      }
    }
    return count <= 2;
  }

  public MyNumber plus(MyNumber obj) {
    int result = number + obj.number;
    MyNumber newNumber = new MyNumber(result);
    return newNumber;
  }

  public boolean isPerfectNumber() {
    int c = 0;
    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        c+=i;
      }
    }
    return c == number;
  }

  public String toString() {
    if (isPrime()) {
      return number + " (prime number)";
    }
    else {
      return number + " ";
    }
  }












}

