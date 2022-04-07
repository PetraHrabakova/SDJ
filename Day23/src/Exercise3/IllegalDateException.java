package Exercise3;

public class IllegalDateException extends RuntimeException
{
  public IllegalDateException() {
    System.out.println("Invalid date input");
  }
}
