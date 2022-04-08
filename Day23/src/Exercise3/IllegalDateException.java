package Exercise3;

public class IllegalDateException extends RuntimeException
{
  public IllegalDateException() {
    super("Invalid date input");
  }
}
