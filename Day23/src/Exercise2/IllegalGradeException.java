package Exercise2;

public class IllegalGradeException extends RuntimeException
{
  public IllegalGradeException() {
    System.out.println("Invalid grade");
  }

}
